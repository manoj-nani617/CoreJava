package com.techouts.multithreading;
class Table implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Thread "+Thread.currentThread().getName());
        }
    }
}
public class TableThread {
    public static void main(String[] args) {
        Table[] t  = new Table[4];
        Thread[] thread = new Thread[4];
        for(int i = 0; i < 4 ;i++)
        {
            t[i] = new Table();
            thread[i] = new Thread(t[i]);
            thread[i].start();

        }


//        Table t = new Table();
//        Thread table = new Thread(t,"t1");
//        table.start();
//
//        Table t1 = new Table();
//        Thread table1 = new Thread(t1,"t2");
//        table1.start();
//
//        Table t2 = new Table();
//        Thread table2 = new Thread(t2,"t3");
//        table2.start();


//
        for(int i = 0; i < 5; i++)
            System.out.println("Main Thread");
    }



}
