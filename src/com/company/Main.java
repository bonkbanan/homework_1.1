package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\dench\\Desktop\\Уроки java\\h2.txt")));
        content.toLowerCase();
        content = content.replaceAll("\\n" , "");
        content = content.replaceAll("[^A-Za-z ]" , "");
        String[] words = content.split(" ");
        for (int j = 97; j <123; j++) {
            int counter = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 1 && words[i].charAt(0) == (char)j) {
                    counter++;
                }
            }
            System.out.println(counter + " - number of words with '" + (char)j + "'");
        }
    }
}