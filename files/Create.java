package com.techouts.files;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {
//    File is used to save the data so that it can be read later, even after the program stops running.
//    File = stored data with a name and location on disk.

//    File is a class im java. is used to work with the files and folders.
//    It is mainly used to create, delete, check and get information about a files or folders.
    public static void main(String[] args) throws IOException {
        File f = new File("file.txt");
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.setReadable(true));
        System.out.println(f.setWritable(true));
        System.out.println(f.canExecute());
        System.out.println(f.createNewFile());
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.isDirectory());
        System.out.println(f.isHidden());
    }
}
