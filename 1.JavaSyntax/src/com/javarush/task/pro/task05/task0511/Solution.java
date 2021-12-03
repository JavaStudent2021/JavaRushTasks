package com.javarush.task.pro.task05.task0511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Создаем двухмерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        multiArray = new int[x][];
        if (x != 0) {
            for (int i = 0; i < x; i++) {
                int z = Integer.parseInt(reader.readLine());
                multiArray[i] = new int[z];
            }
        }
    }
}
