package com.techouts.multithreading;

public class AnonymousThread {
    public static void main(String[] args) {
        Runnable r1 =  new Runnable(){
             public void run() {
                System.out.println("This is a anonymous class");

            }

        };
        Thread t = new Thread(r1,"t1");
        t.start();
    }
}
