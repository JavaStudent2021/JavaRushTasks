package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        ArrayList<Integer> list = new ArrayList<>();
        String str;
        while ((str = reader.readLine()) != null) {
            int x = Integer.valueOf(str);
            if (x % 2 == 0) list.add(x);
        }
        Collections.sort(list);
        list.forEach(a -> System.out.println(a));
        reader.close();
    }
}
