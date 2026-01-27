package com.techouts.multithreading;
class Thread1 implements Runnable {
//    we create a new class which implements Runnable Interface and define the run method.
//    Then we instantiate object of thread class and pass the object of child class then call the start method which automatically calls the run method

    String message;
    Thread1() {

    }
    Thread1(String message) {
        this.message = message;
    }
    public void run(){

//        try {
//            prime();
//            Thread.sleep(2000);
//            fibonacci();
//            Thread.sleep(2000);
//            divison();
//        }
//        catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
        TicketBooking t = new TicketBooking();
        t.bookTicket();

    }
    public void prime(){
        System.out.println(message+" Executing This isa prime program");

    }
    public void fibonacci() {
        System.out.println(message+" Executing Fibonacci");
    }
    public void divison() {
        System.out.println(message+" Division");
    }

}
class TicketBooking {
    int ticket = 1;
   synchronized void bookTicket() {

        if(ticket > 0) {
            System.out.println("You can book a ticket");
            ticket++;
        }
        else {
            System.out.println("You dont have tickets");
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        System.out.println("Thread 1 starting Execution");
        Thread t = new Thread(new Thread1("Thread-1"));
        t.start();
        System.out.println("Thread 2 starting Execution");
        Thread t1 = new Thread(new Thread1("Thread-2"));
        t1.start();
        System.out.println("Thread 3 starting Execution");
        Thread t2 = new Thread(new Thread1("Thread-3"));
        t2.start();
        System.out.println("Thread 4 starting Execution");
        Thread t3 = new Thread(new Thread1("Thread-4"));
        t3.start();

    }
}
