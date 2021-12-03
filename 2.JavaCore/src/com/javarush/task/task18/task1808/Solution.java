package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream("C:\\DiskD\\jav\\er3.txt"); // "C:\\DiskD\\jav\\er3.txt"
        FileOutputStream fileOutputStream_2 = new FileOutputStream("C:\\DiskD\\jav\\er4_2.txt"); // "C:\\DiskD\\jav\\er4_2.txt"
        FileOutputStream fileOutputStream_3 = new FileOutputStream("C:\\DiskD\\jav\\er4_3.txt"); // "C:\\DiskD\\jav\\er4_3.txt"

        int file_lenght = fileInputStream.available() % 2 == 0 ? fileInputStream.available() / 2 : fileInputStream.available() / 2 + 1;
        System.out.println(file_lenght);

        while (fileInputStream.available() > 0) {
            if (fileInputStream.available() > file_lenght-1) {
                fileOutputStream_2.write(fileInputStream.read());
            } else {
                fileOutputStream_3.write(fileInputStream.read());
            }
        }

        fileInputStream.close();
        fileOutputStream_2.close();
        fileOutputStream_3.close();
    }
}
