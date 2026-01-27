package com.techouts.multithreading;

class thread extends Thread {
    @Override
    public void run() {
        System.out.println("This is a thread"+Thread.currentThread().getName());
    }
}
public class MultiThreading {
//    MultiThreading in java feature that enables the program to run multiple threads simultaneously, and enables the program to execute in parallel and utilize the CPU more efficiently.
//    Thread is a light weight, independent of execution inside the program.
//    A process can have multiple threads but each thread shares a same memory.
public static void main(String[] args) {
    thread t = new thread();
    thread t1 = new thread();
    thread t2 = new thread();
    thread t3 = new thread();
    thread t4 = new thread();
    t.start();
    t1.start();
    t2.start();
    t3.start();
    t4.start();
}

}
