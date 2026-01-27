package com.techouts.Assessment2;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
//        Try block contain the code in which the runtime error may occur.
//        Try must contain at least one catch block or finally block.
//        Try block can can have multiple catch blocks.
//        Try block can be nested with in another try block.
        try {
            int[] arr = new int[2];
            System.out.println(arr[3]);
        }
//        Catch block contain the handling code for runtime errors.
//        Multiple catch blocks can be written for one try block.
//        Catch block must be preceded by try block
        catch (StringIndexOutOfBoundsException s) {
            System.out.println(s.getMessage());
        }
        catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println(arr.getMessage());
        }
        finally {

//            Finally block executes whether the exception occur or not.
//            Finally block mainly used to close the resources like files, streams etc.
            System.out.println("This block executed ");

        }

    }
}
