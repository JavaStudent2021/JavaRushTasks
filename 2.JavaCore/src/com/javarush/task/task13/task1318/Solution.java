package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        while (fileInputStream.available() >0){
            char line = (char) fileInputStream.read();
            System.out.print(line);
        }
        fileInputStream.close();
        reader.close();
    }
}