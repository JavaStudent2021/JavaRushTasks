package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file_1 = reader.readLine();
        String file_2 = reader.readLine();

        FileReader fileReader = new FileReader(file_1);

        String str_1 = "";
        while (fileReader.ready()) {
            char a = (char) fileReader.read();
            System.out.print(a);
            str_1 += a;
        }
        System.out.println(str_1);
        FileWriter fileWriter = new FileWriter(file_1);
        FileReader fileReader_2 = new FileReader(file_2);
        while (fileReader_2.ready()){
            fileWriter.write(fileReader_2.read());
            fileWriter.flush();
        }
        fileWriter.write(str_1);
        fileWriter.flush();
        fileReader.close();
        fileReader_2.close();
        fileWriter.close();
    }
}
