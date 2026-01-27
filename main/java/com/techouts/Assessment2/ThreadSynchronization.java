package com.techouts.Assessment2;
class Worker1 implements  Runnable {
    BrickFactory b;
    Worker1(BrickFactory b) {
        this.b= b;
    }
    public  void run() {
       for(int i = 0; i < 20000; i++)
           b.perform();
    }
}class Worker2 implements  Runnable {
    BrickFactory b;
    Worker2(BrickFactory b) {
        this.b= b;
    }
    public  void run() {
        for(int i = 0; i < 20000; i++)
            b.perform();
    }
}
class BrickFactory {
    int count = 0;
    synchronized void perform() {
        count++;
    }
}
public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        BrickFactory b = new BrickFactory();
        Thread t1 = new Thread(new Worker1(b));
        Thread t2 = new Thread(new Worker2(b));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(b.count);
    }

}
