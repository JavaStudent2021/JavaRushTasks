package com.javarush.task.jdk13.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из чисел в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrStr = new int[10];
        int x = arrStr.length;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < x; i++) {
            arrStr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = x-1; i >= 0; i--) {
            System.out.println(arrStr[i]);
        }
    }
}

