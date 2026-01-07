package com.techouts.cj6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
//    Try with resources feature introduced in java 7 to automatically closes the resources after use (like files, databases, streams)
//    Before Java 7 we had to close the resources manually in finally.
//    Try with resources closes resources even if exception occurs.
    public static void main(String[] args)throws IOException {
        try(FileReader f  = new FileReader("file.txt")) {
            System.out.println("The run time error may occurss");
        }
        catch (FileNotFoundException f) {
            System.out.println("File is not found");
        }

    }
}
