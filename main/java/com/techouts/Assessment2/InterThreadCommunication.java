package com.techouts.Assessment2;

class Producer implements Runnable {
    InterThreadCommunication it;

    Producer(InterThreadCommunication it) {
        this.it = it;
    }

    public void run() {
        while (true) {
           try {
               it.producer();
               Thread.sleep(1000);
           }
           catch (InterruptedException i){
               System.out.println(i.getMessage());
           }
        }
    }
}

class Consumer implements Runnable {
    InterThreadCommunication it;

    Consumer(InterThreadCommunication it) {
        this.it = it;
    }

    public void run() {
        while (true) {
            try {
                it.consume();
                Thread.sleep(1000);
            }
            catch(InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}

public class InterThreadCommunication {
    int num = 0;
    boolean setValue = false;

    public static void main(String[] args) {
        InterThreadCommunication it = new InterThreadCommunication();
        Thread t1 = new Thread(new Producer(it));
        Thread t2 = new Thread(new Consumer(it));

        t1.start();
        t2.start();
    }

    void producer()throws InterruptedException {
        synchronized (this) {
            while (setValue) {
                try {
                    wait();
                } catch (InterruptedException i) {
                    System.out.println(i.getMessage());
                }

            }
            num++;
            System.out.println("Produced " + num);
            setValue = true;
            notifyAll();
        }
    }

    void consume() throws InterruptedException {
        synchronized (this) {
            while (!setValue) {
                try {
                    wait();
                } catch (InterruptedException i) {
                    System.out.println(i.getMessage());
                }

            }
            System.out.println("Consumed " + num);
            setValue = false;
            notifyAll();
        }
    }
}