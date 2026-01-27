package com.techouts.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamFile {
    public static void main(String[] args) throws IOException {
        File f = new File("file2.txt");
        if(!(f.exists()))
        {
            f.createNewFile();
        }
        try(FileInputStream fi = new FileInputStream("download.jfif");
            FileOutputStream fo =new FileOutputStream("file2.txt"))
        {
            int i ;
            while((i = fi.read()) != -1) {
                fo.write(i);
            }

        }
        catch(IOException io)
        {
            System.out.println(io.getMessage());
        }

    }
}
