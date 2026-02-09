package com.techouts;

import jakarta.persistence.criteria.CriteriaBuilder;

class Work {
    synchronized void method() {
        try {
            System.out.println(Thread.currentThread().getName());
            wait();
        }
        catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        notifyAll();
    }
    synchronized void method2() {
        try {
            System.out.println(Thread.currentThread().getName());
            wait();
        }
        catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        notifyAll();
    }
}
class r1 implements Runnable {
    Work w;
    r1(Work w) {
        this.w = w;
    }

    public void run() {
        w.method2();
        }

    }
class r2 implements Runnable {
    Work w;
    r2(Work w) {
        this.w = w;
    }

    public void run() {
        w.method();

    }
}
public class Rough {
    public static void main(String[] args)throws InterruptedException {
        ;Work w = new Work();
        Thread t = new Thread(new r1(w));
        Thread t1 = new Thread(new r2(w));
        t.start();
        t1.start();
        Thread.sleep(3000);
        System.out.println(t.getState());
        System.out.println(t1.getState());

    }
}
