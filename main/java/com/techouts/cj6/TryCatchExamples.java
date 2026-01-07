package com.techouts.cj6;

import java.io.FileReader;
import java.io.IOException;
//Simple Arithmetic Exception
class Example1 {
    public void Example() {
        try {
            int a = 10 / 0;   // runtime error
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

//  IO Exception
 class Example2 {
    public void Example() {
        try {
            FileReader fr = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
//Array Index Bounds Exception
class Example3 {
    public void Example() {
        try {
            int[] arr = new int[5];
            arr[10] = 20;        // ArrayIndexOutOfBoundsException
            int x = 10 / 0;      // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Math error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
    }
}
//Single Catch Block with Multiple Exceptions
class Example4 {
    public void Example(){
        try {
            int a = 10 / 0;
        } catch (ArithmeticException | NullPointerException | StringIndexOutOfBoundsException s) {
            System.out.println("Runtime exception occurred");
        }
    }
}



public class TryCatchExamples {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        Example2 e2 = new Example2();
        Example3 e3 = new Example3();
        Example4 e4 = new Example4();
        e1.Example();
        e2.Example();
        e3.Example();
        e4.Example();



    }
}
