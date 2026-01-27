package com.techouts.projects;
class Count {
    int count = 0;
    synchronized void  increment() {
        this.count++;
    }
     
}
class thread implements Runnable {
    Count c;
    thread(Count c) {
        this.c = c;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++)
        {
            c.increment();
        }

    }
}
public class MultiThreadingCounter {
    public static void main(String[] args) throws InterruptedException{
        Count c = new Count();
        Thread t = new Thread(new thread(c));
        Thread t1 = new Thread(new thread(c));
        t.start();
        t1.start();
        System.out.println(t1.getState());
        System.out.println(t.getState());
        System.out.println(c.count);


    }

}
