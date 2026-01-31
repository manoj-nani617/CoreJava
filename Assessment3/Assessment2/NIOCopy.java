package com.techouts.Assessment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOCopy {
    public static void main(String[] args) throws IOException {
        Path source  = Paths.get("file.txt");
        Path destination = Paths.get("file2.txt");
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }
}
