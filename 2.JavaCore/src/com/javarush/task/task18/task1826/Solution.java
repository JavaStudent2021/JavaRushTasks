package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String keyLine = null;
        String[] arrArr;
        if (args.length != 0) {
            keyLine = args[0];
            arrArr = args.clone();

            if (keyLine.equals("-e")) {
                schifr(arrArr);
            }
            if (keyLine.equals("-d")) {
                not_schifr(arrArr);
            }
        }
    }

    public static void schifr(String[] arr) throws IOException {

        String fileName = arr[1];
        String fileOutputName = arr[2];

        System.out.println(fileName);
        System.out.println(fileName.length());

        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);

        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read());
            fileOutputStream.write('5');
        }
        fileInputStream.close();
        fileOutputStream.close();

    }

    public static void not_schifr(String[] arr) throws IOException {

        String fileName = arr[1];
        String fileOutputName = arr[2];

        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);
        int t = 1;
        while (fileInputStream.available() > 0) {
            if (t++ % 2 != 0) {
                fileOutputStream.write(fileInputStream.read());
            }else {
                fileInputStream.read();
            }

        }
        fileInputStream.close();
        fileOutputStream.close();

    }

}
