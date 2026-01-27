package com.techouts.Assessment2;
class thread extends Thread {
    public void run() {
        System.out.println("Thread is created successfully using thread class");
    }
}
class thread2 implements Runnable {
    public void run() {
        System.out.println("Thread is created successfully using Runnable Interface");
    }
}
public class CreateThread {
//    Multithreading enables the program to run in multiple threads simultaneously. and allowing tasks to execute in parallel ana utilize CPU more effeciently.
//    Thread is a light weight and independent of execution inside a program.
//    A process can have multiple threads.
//    But each thread executes independently and shares the same memory.
    public static void main(String[] args) {
        thread t1 = new thread();
        t1.start();             // started execution which automatically calls run method
        System.out.println(t1.getState());

        Thread t2 = new Thread(new thread2());
        t2.start();             // t2 started execution which automatically calls run method
        System.out.println(t2.getState());
    }

}
