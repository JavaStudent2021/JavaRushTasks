package com.javarush.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка списка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size(); i++) {
            if (x >= list.get(i).length()) {
                System.out.println(i);
                break;
            }
            x = list.get(i).length();
        }
        //System.out.println(list.get(3));
    }
}

