package com.javarush.task.jdk13.task07.task0716;

import java.util.ArrayList;
import java.util.ListIterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код

        strings.removeIf(s -> {
            return s.contains("р") & !s.contains("л");
        });
        ArrayList<String> list = new ArrayList<>();
        for (String st : strings) {
            if (!st.contains("р") & st.contains("л")) {
                list.add(st);
            }
        }
        strings.addAll(list);
        return strings;
    }
}