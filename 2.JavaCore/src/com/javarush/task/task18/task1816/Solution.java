package com.javarush.task.task18.task1816;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        FileReader fileReader = new FileReader(new File(args[0]));
        while (fileReader.ready()) {
            char a = (char) fileReader.read();
            for (int i = 'A' & 'a'; i <= 'z'; i++) {
                if (a == i) count++;
            }
        }
        fileReader.close();
        System.out.println(count);
    }
}
