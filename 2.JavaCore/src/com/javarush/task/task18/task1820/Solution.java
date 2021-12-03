package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile_1 = reader.readLine();
        String nameFile_2 = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile_1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(nameFile_2));

        String line = "";
        while (fileReader.ready()) {
            char a = (char) fileReader.read();
            if (a == 32 | a == '\n') {
                fileWriter.write((int) Math.round(Double.parseDouble(line)) + " ");
                fileWriter.flush();
                line = "";
            } else {
                line += a;
            }
        }
        fileWriter.write((int) Math.round(Double.parseDouble(line)) + " ");
        fileWriter.flush();

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
