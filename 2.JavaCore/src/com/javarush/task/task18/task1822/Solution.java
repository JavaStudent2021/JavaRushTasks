package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine(); // "C:\\DiskD\\jav\\er3.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));

        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] str = line.split(" ");
            if (str[0].equals(args[0])) System.out.println(line);
        }
        reader.close();
        bufferedReader.close();
    }
}
