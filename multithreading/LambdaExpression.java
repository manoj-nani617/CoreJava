package com.techouts.multithreading;

public class LambdaExpression {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> {
              for(int i = 0; i < 5; i++)
                System.out.println(Thread.currentThread().getName());
        };
        Thread t = new Thread(r1);
        t.start();
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r1);
        t2.start();
        Thread.sleep(1000);
    }
}
