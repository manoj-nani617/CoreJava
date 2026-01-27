package com.techouts.multithreading;
class BrickDiary {
    static int countOfBrick = 0;
    synchronized   void brickCount() {

        BrickDiary.countOfBrick  += 1;
//         System.out.println(Thread.currentThread().getName()+" added value "+countOfBrick);
    }
}
class Worker1 implements Runnable {
//    BrickDiary obj;
//    Worker1(BrickDiary obj) {
//        this.obj = obj;
//
//    }

    @Override
    public void run() {
        BrickDiary b = new BrickDiary();
        for(int i = 0; i < 10000; i++)
        {
            b.brickCount();
        }
    }
}class Worker2 implements Runnable {
//    BrickDiary obj;
//    Worker1(BrickDiary obj) {
//        this.obj = obj;
//
//    }
    @Override
    public void run() {
        BrickDiary b = new BrickDiary();
        for(int i = 0; i < 10000; i++)
        {
            b.brickCount();
        }

    }
}class Worker3 implements Runnable {
//    BrickDiary obj;
//    Worker1(BrickDiary obj) {
//        this.obj = obj;
//
//    }
    @Override
    public void run() {
        BrickDiary b = new BrickDiary();
        for(int i = 0; i < 10000; i++)
        {
            b.brickCount();
        }
    }
}
public class SynchronizationThread {
    public static void main(String[] args) throws InterruptedException{
        BrickDiary obj  =  new BrickDiary();
        Thread t1 = new Thread(new Worker1());
        Thread t2 = new Thread(new Worker2());
        Thread t3 = new Thread(new Worker3());

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(BrickDiary.countOfBrick);

    }
}