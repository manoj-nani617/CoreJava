package com.techouts.files;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args)throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter("file.txt"));
        BufferedReader bfr = new BufferedReader(new FileReader("file.txt"));
        bfw.write("Entier liens are gone and removed and added first line as this statement");
        bfw.close();
        String line;
        while((line = bfr.readLine()) != null)
        {
            System.out.println(line);
        }


        bfr.close();


    }
}
