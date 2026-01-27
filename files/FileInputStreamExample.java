package com.techouts.files;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try(FileInputStream f = new FileInputStream("download.jfif")) {
            int i ;
            while((i = f.read()) != -1) {
                System.out.print((char) i+"\t");
            }
        }
        catch(IOException i) {
            System.out.println(i.getMessage());
        }
    }
}
