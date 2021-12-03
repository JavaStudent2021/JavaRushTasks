package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile_1 = reader.readLine();
        String nameFile_2 = reader.readLine();
        FileReader fileReader = new FileReader(nameFile_1);
        FileWriter fileWriter = new FileWriter(nameFile_2);
        int t = 1;
        while (fileReader.ready()) {
            int q = fileReader.read();
            if (t % 2 == 0) {
                fileWriter.write((char) q);
                fileWriter.flush();
            }
            t++;
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
