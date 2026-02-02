package com.techouts.Assessment2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("file.txt",true);
        fw.write("Hell iam writing into the file");
        fw.close();
    }
}
