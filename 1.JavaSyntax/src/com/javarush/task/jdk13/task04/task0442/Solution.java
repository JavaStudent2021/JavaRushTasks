package com.javarush.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        while (true){
            int x = Integer.parseInt(reader.readLine());
            if (x == -1){
                m = m+ x;
                break;

            }else {
                m = m+ x;
            }
        }
        System.out.println(m);
    }
}
