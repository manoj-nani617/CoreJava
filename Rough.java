package com.techouts;
class Work {
    void function() {
        System.out.println("This is a function");
    }
}
class r1 implements Runnable {
    Work w;
    r1(Work w) {
        this.w = w;
    }
    public void run() {

    }
}class r2 implements Runnable {
    Work w;
    r2(Work w) {
        this.w = w;
    }
    public void run() {

    }
}class r3 implements Runnable {
    Work w;
    r3(Work w) {
        this.w = w;
    }
    public void run() {

    }
}
public class Rough {
    public static void main(String[] args)throws InterruptedException {
        Work w = new Work();
        Thread t = new Thread(r1);
        Thread t1 = new Thread(r2);
        Thread t2 = new Thread(r3);
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(2000);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
