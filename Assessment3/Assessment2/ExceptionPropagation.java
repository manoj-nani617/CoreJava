package com.techouts.Assessment2;

public class ExceptionPropagation {
//    Exception thrown from the top of the stack and if not caught, it drops down the call stack to the previous method.
//    If a method throws an exception the run time system try to find something to solve it.
//    The set of all possible something's to handle exceptions are the ordered list of methods that had to be called to get the error which the error occur.
//    The list of methods is called as the call stack and searching the method is called as the exception propgation.
    void runtimeError() {
        String s = "manoj";
        System.out.println(s.charAt(10));
    }
    void noHandlingCode() {
        runtimeError();
    }
    void handlingCode() {
        try{
            noHandlingCode();
        }
        catch (StringIndexOutOfBoundsException s)
        {
            s.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ExceptionPropagation e = new ExceptionPropagation();
        e.handlingCode();
    }
}
