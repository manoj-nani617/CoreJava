package com.techouts.projects;
import java.util.LinkedList;

class Producer implements Runnable {
    ProducerConsumerProblem p;
    Thread t1;

    Producer(ProducerConsumerProblem p) {
        t1 = new Thread(this);
        this.p = p;
        t1.start();
    }

    @Override
    public void run() {
        try {
            while(true) {
                p.num++;
                p.produce(p.num);
                Thread.sleep(1000);

            }
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }

}

class Consumer implements Runnable {
    ProducerConsumerProblem p;
    Thread t2;
    Consumer(ProducerConsumerProblem p) {
        t2 = new Thread(this);
        this.p = p;
        t2.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                p.consume();
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

}

public class ProducerConsumerProblem {
    int num = 0;
//    LinkedList<Integer> list = new LinkedList<>();
//    int capacity = 5;
    boolean setValue = false;

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerProblem pc = new ProducerConsumerProblem();
        Producer p = new Producer(pc);
        Consumer c = new Consumer(pc);
    }

    public void produce(int num) throws InterruptedException {
            synchronized (this) {
                while (setValue) {
//                if (list.size() == capacity) {
//                    System.out.println("The Capacity is full please wait");
                    wait();
//                }
            }
//                num++;
//                list.add(num);
                System.out.println("Produced Element " + num);
                setValue = true;
                notifyAll();
//                Thread.sleep(1000);

//            }
        }

    }

    public  void consume() throws InterruptedException {
            synchronized (this) {
                while (!setValue) {
//                if (list.isEmpty()) {
//                    System.out.println("The Size is empty, please wait");
                    wait();
                }
//                int val = list.removeFirst();
                System.out.println("Consumed " + num);
                setValue = false;
                notifyAll();

//                Thread.sleep(1000);
            }


        }

}
