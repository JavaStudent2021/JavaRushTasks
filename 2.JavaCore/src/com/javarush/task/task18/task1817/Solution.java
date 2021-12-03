package com.javarush.task.task18.task1817;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File(args[0]));
        int countABC = 0;
        int countProb = 0;
        while (fileReader.ready()) {
            char a = (char) fileReader.read();
            countABC++;
            if (a == ' ') countProb++;
        }
        fileReader.close();
        System.out.printf("%.2f", (double) countProb / countABC * 100);
    }
}
