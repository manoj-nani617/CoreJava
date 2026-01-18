package com.techouts;
import java.io.IOException;
class Producer implements Runnable {
    Rough obj;
    Producer(Rough obj) {
        this.obj = obj;
    }

    public void run() {
        while (true) {
            try {obj.produce(obj.num++);} catch (Exception e) {}
            System.out.println("It is "+obj.num);
        }
    }
}
class Consumer implements Runnable {
    Rough obj;
    Consumer(Rough obj) {
        this.obj = obj;
    }
    public void run() {
        System.out.println("hello world");
        while(true) {
            try{ obj.consume();}catch(Exception e) {}
        }

    }

}
public class Rough {
    int num = 0;
    boolean setValue = false;
    public static void main(String[] args)throws IOException {
        Rough obj = new Rough();
        Thread t1 = new Thread(new Producer(obj));
        Thread t2 = new Thread(new Consumer(obj));
        t1.start();
        t2.start();

    }
    void produce(int num)throws InterruptedException {
        this.num = num;
       synchronized (this) {
           while(setValue) {
               try { wait();}catch (Exception e) {
                   System.out.println(e.getMessage());
               };
           }
           System.out.println("Produced"+this.num);
           setValue = true;
           notifyAll();
       }
        Thread.sleep(1000);

    }
    void consume()throws  InterruptedException {
        synchronized (this) {
            while(!setValue) {
                try { wait();}catch (Exception e) {System.out.println(e.getMessage());};

            }
            System.out.println("Consumed"+num);
            setValue = false;
            notifyAll();
        }
        Thread.sleep(1000);

    }

}
