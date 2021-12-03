package com.javarush.task.jdk13.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее такое среднее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a <= b) & (b <= c) || (c <= b) & (b <= a)) {
            System.out.println(b);
        }else if ((a >= b) & (a <= c) || (c <= a) & (b >= a)) {
            System.out.println(a);
        } else if ((b <= c) & (c <= a) || (a <= c) & (c <= b)) {
            System.out.println(c);
        }

    }
}
