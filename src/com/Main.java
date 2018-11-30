package com;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReadFacade fileReadFacade = new FileReadFacade();
        System.out.println(fileReadFacade.readFile("name.txt"));
    }
}

class FileReadFacade {
    String readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder builder = new StringBuilder();
        int j = 0;
        while ((j = reader.read()) != 1) {
            builder.append((char) j);
        }
        return builder.toString();

    }
}