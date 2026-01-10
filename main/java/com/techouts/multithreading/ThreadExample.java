package com.techouts.multithreading;
class BookingTickets implements Runnable {
    public void run() {
        try {

            // Timed waiting
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of bookingThread while mainThread is waiting: " +
                ThreadExample.ticket.getState());

        try {

            // Another timed waiting
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
class TicketSystem implements Runnable {
    BookingTickets bt;
    Thread booking;
    public void run() {
        bt = new BookingTickets();
        booking = new Thread(bt);

        System.out.println(booking.getState()+" executed by the "+Thread.currentThread().getName());
        booking.start();
        System.out.println(booking.getState()+" executed by the "+Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException i) {
            System.out.println(i.getMessage());
        }
        System.out.println(booking.getState());
//        try {
//            booking.join();
//        }
//        catch(InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println(booking.getState());
        System.out.println(booking.getState()
        );
    }
}
public class ThreadExample {
    static TicketSystem ts;
    static Thread ticket;
    public static void main(String[] args) {
        ts = new TicketSystem();
        ticket = new Thread(ts,"ticket");
        System.out.println(ticket.getState());

        ticket.start();
        System.out.println(ticket.getState());




    }
}