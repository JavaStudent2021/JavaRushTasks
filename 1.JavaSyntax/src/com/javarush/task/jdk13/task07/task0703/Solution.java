package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Два массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = new String[10];
        int[] arrNumb = new int[10];
        int x = arrStr.length;
        for (int i = 0; i < x; i++) {
            arrStr[i] = reader.readLine();
            arrNumb[i] = arrStr[i].length();
            System.out.println(arrNumb[i]);
        }
    }
}
