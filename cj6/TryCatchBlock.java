package com.techouts.cj6;
public class TryCatchBlock {
//    Exception :
//    Exception are the runtime errors that occurs during program Execution.
//    When runtime error occurs, the program will terminated abruptly if it is not handled..
//    Try Block contain the code in which runtime Error may occur.
//    Try block must be followed by at least one catch block or finally block
//    Try Block can be nested into the another try block
//    Multiple catch blocks can be written for single try block.
//    catch block must be presided by the try block
//    Catch Block contain the handling code for runtime errors.

    public static void main(String[] args) {
        int arr[] = new int[3];
        try {
            int store = 9 /0;
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This statement printed whether the exception thrown or not");
        }

    }
}
