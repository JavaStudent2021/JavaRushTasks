package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String nameFile_1 = reader.readLine();
        String nameFile_2 = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(nameFile_1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(nameFile_2));

        while (fileReader.ready()){
            String line = String.valueOf((char) fileReader.read());
            fileWriter.write(line.replace(".","!"));
            fileWriter.flush();
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
