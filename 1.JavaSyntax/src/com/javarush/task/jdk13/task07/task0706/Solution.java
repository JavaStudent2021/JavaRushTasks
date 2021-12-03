package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrNumb = new int[15];
        int x = arrNumb.length;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < x; i++) {
            arrNumb[i] = Integer.parseInt(reader.readLine());
            if (i %2 == 0) {
                even +=arrNumb[i];
            }else {
                odd +=arrNumb[i];
            }
        }
        System.out.println(even > odd ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");


    }
}
