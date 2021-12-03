package com.javarush.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Максимальное и минимальное числа в массиве
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] numb = new int[20];
        for (int i = 0; i < numb.length; i++) {
            numb[i] = Integer.parseInt(reader.readLine());
        }

        int y = 0;
        int x = 0;
        for (int i = 0; i < numb.length; i++) {
            if (y == 0) {
                y = numb[i];
            } else if (y > numb[i]) {
                y = numb[i];
            }

            if (x == 0) {
                x = numb[i];
            } else if (x < numb[i]) {
                x = numb[i];
            }
        }
        minimum = y;
        maximum = x;

        System.out.print(maximum + " " + minimum);
    }
}
