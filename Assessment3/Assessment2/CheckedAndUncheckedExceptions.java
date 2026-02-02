package com.techouts.Assessment2;

import java.io.FileReader;
import java.io.IOException;

class CheckedException {
//    Checked Exceptions are the Exceptions that occurs in the compile time and that are handled by the compiler
//    Checked Exceptions are also called as compile time exceptions
    void readingFile() throws IOException{                      //Checked Exceptions
//        try{
            FileReader fr = new FileReader("file.txt");
            int i = 0;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);

            }
        System.out.println();
//        }
//        catch(IOException e) {
//            e.getMessage();
//        }
    }
}class UncheckedExceptions {
//    Unchecked Exceptions are the Exceptions that occurs in the Runtime.
//    Unchecked Exceptions are also called as Runtime exceptions
//    When run time exceptions occur the programing will be terminated abruptly.
    void arithmeticException() {                      //Checked Exceptions
        try{
            int a = 1/0;
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
public class CheckedAndUncheckedExceptions {
    public static void main(String[] args) throws IOException{
        CheckedException ch = new CheckedException();
        UncheckedExceptions u = new UncheckedExceptions();
        ch.readingFile();
        u.arithmeticException();
    }

}
