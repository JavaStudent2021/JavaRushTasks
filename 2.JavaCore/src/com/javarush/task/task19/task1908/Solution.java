package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile_1 = reader.readLine();// "C:\\DiskD\\jav\\er3.txt";
        String nameFile_2 = reader.readLine(); // "C:\\DiskD\\jav\\er3-m2.txt";
        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile_1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(nameFile_2));

        String line = "";
        while ((line = fileReader.readLine()) != null) {
            String[] str = line.split(" ");
            for (int i = 0; i < str.length; i++) {
                try {
                    int t = Integer.parseInt(str[i]);
                    fileWriter.write(String.valueOf(t)+" ");
                    fileWriter.flush();
                } catch (Exception e) {
                }
            }
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
