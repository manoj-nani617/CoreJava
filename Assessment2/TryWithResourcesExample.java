package com.techouts.Assessment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
//        Try with resources are introduced in jav8 which automatically closes the resources like streams, databases, file etc.
//        Before java 8 we have to close the files manually in finally.
//        Try with resources closes automatically even if exception occur.
        try(FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr)) {
            String s;
            while((s = br.readLine()) != null)
            {
                System.out.println(s);
            }

        }
        catch(IOException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
