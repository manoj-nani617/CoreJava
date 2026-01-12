package com.techouts.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        int i;
        while((i = br.read()) != -1) {
            System.out.print((char) i);

        }
        br.close();
        br = new BufferedReader(new FileReader("file.txt"));

        String s;
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
    }
}
