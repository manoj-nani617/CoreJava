package com.techouts.multithreading;
class Priority implements Runnable {
    public void run(){
        for(int i = 0; i < 100; i++)
            System.out.println("hello"+"\t"+Thread.currentThread().getName());

    }
}
public class PriorityOfThread {

    public static void main(String[] args) {
            Priority p = new Priority();
            Thread t = new Thread(p);
            t.start();
        t.setPriority(Thread.MAX_PRIORITY);

        Priority p1 = new Priority();
        Thread t1 = new Thread(p1);
        t1.start();
        t1.setPriority(Thread.MIN_PRIORITY);





    }
}
