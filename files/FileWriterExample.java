package com.techouts.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
       try( FileWriter fw  = new FileWriter("file.txt")) {
           fw.write("This is the data with in the file");


       }

    }

}
