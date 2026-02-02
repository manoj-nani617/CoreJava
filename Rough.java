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
        Thread t = new Thread(new r1(w));
        Thread t1 = new Thread(new r2(w));
        Thread t2 = new Thread(new r3(w));
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(2000);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
