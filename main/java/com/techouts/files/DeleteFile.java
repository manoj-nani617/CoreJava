package com.techouts.files;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args)throws IOException {
        File f = new File("file2.txt");
        if(f.exists()) {
            System.out.println("The file exists");
        }
        else {
            f.createNewFile();

        }
        if(f.delete()){
            System.out.println("The file is deleted"+f.getName());
        }
        else {
            System.out.println("The file is failed to delete"+f.getName());
        }

    }
}
