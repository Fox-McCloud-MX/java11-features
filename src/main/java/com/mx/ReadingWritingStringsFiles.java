package com.mx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingWritingStringsFiles {
    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(
                Files.createTempFile("test", ".txt"),
                "Testing writing files on Java 11"
        );
        
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s); //Testing writing files on Java 11
    }
}
