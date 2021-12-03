package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        FileReader fileReader = new FileReader(nameFile);
        String text = "";
        while (fileReader.ready()) {
            text += (char) fileReader.read();
        }
        String[] str = text.split("[\\p{Punct}\\s]+");
        int count = 0;
        for (String s : str) {
            String m = s.replaceAll("\\p{P}", "");
            if (m.equals("world")) {
                count++;
            }
        }

        reader.close();
        fileReader.close();
        System.out.println(count);
    }
}
