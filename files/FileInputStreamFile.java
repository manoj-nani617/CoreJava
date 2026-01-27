package com.techouts.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamFile {
    public static void main(String[] args) {
        try(FileInputStream fi  = new FileInputStream("file.txt")) {
            int i;
            while((i = fi.read())!= -1)
            {
                System.out.println((char)i);
            }

        }
        catch(IOException i){
            System.out.println(i.getMessage());
        }
        File f = new File("file.txt");
        System.out.println(f.getAbsolutePath());
    }
}
