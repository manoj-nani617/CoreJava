package com.techouts.cj6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
//    Throws declares a exception that method might throw, informing the caller to handle them.
//    It is mainly used with the checked Exception
//    If a method calls another method that throws a checked exception, and it doesn't catch it, must declare in its throws caluse

    public static void main(String[] args) throws IOException {
          try {
              FileReader fr = new FileReader("file.txt");
          }
            catch(IOException o) {
                System.out.println(o.getMessage());
            }

    }
}
