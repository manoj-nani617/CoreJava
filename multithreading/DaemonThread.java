package com.techouts.multithreading;
class ThreadDaemon extends Thread {
//    Daemon Thread run in the background and stops automatically when all user threads are finish.
//    setDaemon thread must be called before the start() method called.
//    Daemon thread may terminated abruptly.
//    Jvm may exits when only Daemon threads remain
//    Daemon threads are not suitable for important tasks.
    public void run() {

        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running");
        }
        for(int i = 0; i < 5000; i++)
            System.out.print(i+" Daemon");
    }

}
class NormalThread extends Thread {
    public void run() {
        System.out.println("This is the normal Thread and this will execute all the time");
        for(int i = 0; i < 5000; i++)
            System.out.print(i+" Normal");
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        ThreadDaemon t = new ThreadDaemon();
        t.setDaemon(true);
        t.start();
        NormalThread nt = new NormalThread();
        nt.start();

    }
}
