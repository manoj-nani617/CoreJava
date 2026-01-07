package com.techouts.cj6;
class Test {
    void method() {
//        int a = 2/0;
    }
    void method2() {
        method();
    }
    void method3() {
        try {
            method2();

        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

public class ExceptionPropagation {
//    In java Exceptions are thrown from the top of the stack and if not caught, it drops down the call stack to the previous method.If a method throws and exception then the runtime system try to find something to solve it.
//    The set of all possible "something" to  handle the exceptions are the list of the methods that had been called to get the method which error occur.
//    The list of methods is called as class stack and method searching is called exception propagation.
public static void main(String[] args) {
    Test t = new Test();
    t.method3();
}
}
