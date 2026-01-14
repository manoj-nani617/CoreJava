package com.techouts.projects;

import java.util.LinkedList;

class Producer implements Runnable {
    ProducerConsumerProblem p;
    int i = 0;
    Thread t1;

    Producer(ProducerConsumerProblem p) {
        t1 = new Thread(this);
        this.p = p;
        t1.start();
    }

    @Override
    public void run() {
        try {
            p.produce(i++);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }

}

class Consumer implements Runnable {
    ProducerConsumerProblem p;
    Thread t2;
    int i = 0;

    Consumer(ProducerConsumerProblem p) {
        t2 = new Thread(this);
        this.p = p;
        t2.start();
    }

    @Override
    public void run() {
        try {
            p.consume();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }

}

public class ProducerConsumerProblem {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;
    boolean setValue = false;

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerProblem pc = new ProducerConsumerProblem();
        Producer p = new Producer(pc);
        Consumer c = new Consumer(pc);
        Thread.sleep(5000);
    }

    public void produce(int num) throws InterruptedException {
        int i = 0;
        while (true) {
            synchronized (this) {

                if (list.size() == capacity) {
                    System.out.println("The Capacity is full please wait");
                    wait();
                }
                i++;
                list.add(i);
                System.out.println("Produced Element " + i);
                notifyAll();

            }
            Thread.sleep(1000);
        }

    }

    public  void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {

                if (list.isEmpty()) {
                    System.out.println("The Size is empty, please wait");
                    wait();
                }
                int val = list.removeFirst();
                System.out.println("Consumed " + val);
                notifyAll();


            }
            Thread.sleep(1000);

        }


    }
}
