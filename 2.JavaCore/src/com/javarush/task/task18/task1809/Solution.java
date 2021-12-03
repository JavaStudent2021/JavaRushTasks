package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine()); //"C:\\DiskD\\jav\\er3.txt"
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine()); // "C:\\DiskD\\jav\\er4.txt"
        int[] e = new int[fileInputStream.available()];
        int t = 0;
        while (fileInputStream.available() > 0) {
            e[t] = fileInputStream.read();
            System.out.println(e[t++]);
        }
        reader.close();
        fileInputStream.close();
        for (int i = e.length-1; i >= 0; i--) {
            fileOutputStream.write(e[i]);
        }

        fileOutputStream.close();
    }
}
