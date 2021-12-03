package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrNumd_1 = new int[20];
        int[] arrNumd_2 = new int[10];
        int[] arrNumd_3 = new int[10];

        for (int i = 0; i < arrNumd_1.length; i++) {
            arrNumd_1[i] = Integer.parseInt(reader.readLine());
        }
        int t = 0;
        for (int i = 0; i < arrNumd_1.length; i++) {
            if (i < arrNumd_2.length) {
                arrNumd_2[i] = arrNumd_1[i];
            }else {
                arrNumd_3[t++] = arrNumd_1[i];
            }
        }
        for (int x: arrNumd_3){
            System.out.println(x);
        }

    }
}
