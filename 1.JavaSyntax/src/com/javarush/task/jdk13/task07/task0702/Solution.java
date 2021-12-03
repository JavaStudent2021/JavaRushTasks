package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строк в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] arrStr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = arrStr.length;
        for (int i = 0; i < x - 2; i++) {
            arrStr[i] = reader.readLine();
        }
        for (int i = x - 1; i >= 0; i--) {
            System.out.println(arrStr[i]);
        }
    }
}