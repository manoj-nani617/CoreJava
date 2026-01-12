package com.techouts.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args)throws IOException {

        FileWriter fw = new FileWriter("file.txt",true);
        fw.write("This is the manoj and he is working the techouts comapny and he is a good man");
        File f = new File("file.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()) {
            String word = sc.nextLine();
            System.out.println(word);
        }
        sc.close();
        fw.close();
    }
}
