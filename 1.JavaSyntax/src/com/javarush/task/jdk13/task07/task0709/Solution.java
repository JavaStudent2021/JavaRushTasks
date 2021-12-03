package com.javarush.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самая короткая строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        list.sort((s1, s2) -> s1.length() - s2.length());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(0).length() == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }

    }
}
