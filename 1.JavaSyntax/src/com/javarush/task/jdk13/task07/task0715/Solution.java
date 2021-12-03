package com.javarush.task.jdk13.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        int x = list.size();
        int t = 0;
        for (int i = x; i > 0; i--) {
            list.add(i,"именно");
        }
        list.forEach(System.out::println);
    }
}
