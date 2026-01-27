package com.techouts.projects;
class TicketBookng implements Runnable {
    public void run() {
        try {
            Thread.sleep(200);
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println(LifeCycle.t1.getState());
    }
}
class TicketSystem implements Runnable {
    public void run() {
        TicketBookng t2 = new TicketBookng();
        Thread booking = new Thread(t2);
        System.out.println(booking.getState());

        booking.start();
        System.out.println(booking.getState());

        try{
            Thread.sleep(100);
            System.out.println(booking.getState());
            booking.join();
        }
        catch(InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println(booking.getState());
    }
}
public class LifeCycle {
    static Thread t1;
    public static void main(String[] args) {
         t1 = new Thread(new TicketSystem());
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

    }

}