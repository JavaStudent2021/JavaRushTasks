package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int by = 0;
        while (fileInputStream.available() > 0) {
            int by_0 = fileInputStream.read();
            if (by == 0) by = by_0;
            if (by <= by_0) by = by_0;
        }
        System.out.println(by);
        reader.close();
        fileInputStream.close();
    }
}
