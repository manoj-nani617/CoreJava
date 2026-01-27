package com.techouts.Assessment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Difference_FIle_Path_Files {
    public static void main(String[] args)throws IOException {
//        Fiile is a class used to create the files and can perform operations like exist, canRead, canWrite etc.
//        Path is a interface that can be implemented by using Files class  and can perform basic operations;
//        Files is a class and can be used to perform operations based on the path interface.

        Path p = Paths.get("file3.txt");
        System.out.println(Files.getFileStore(p));
        System.out.println(Files.exists(p));
        System.out.println(Files.getOwner(p));


    }
}
