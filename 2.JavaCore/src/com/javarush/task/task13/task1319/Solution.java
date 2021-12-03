package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file));
        String line = "";
        while (!line.equals("exit")) {
            line = reader.readLine();
            outputStream.write(line);
            outputStream.write("\n");
        }
        reader.close();
        outputStream.close();
    }
}
