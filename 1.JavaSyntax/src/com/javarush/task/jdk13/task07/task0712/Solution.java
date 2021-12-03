package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        String stringShort = "";
        String strindLong = "";
        int x = 0, y = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (stringShort.isEmpty()) stringShort = strings.get(i);
            if (strings.get(i).length() < stringShort.length()) {
                stringShort = strings.get(i);
                x = i;

            } else if (strindLong.length() < strings.get(i).length()) {
                strindLong = strings.get(i);
                y = i;
            }
        }
        System.out.println((x < y) ? stringShort : strindLong);
    }
}
