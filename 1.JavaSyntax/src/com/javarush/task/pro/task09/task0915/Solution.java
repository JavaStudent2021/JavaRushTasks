package com.javarush.task.pro.task09.task0915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] token = new String[stringTokenizer.countTokens()];
        int t = 0;
        while (stringTokenizer.hasMoreTokens()) {
            token[t++] = stringTokenizer.nextToken();
        }
        return token;
    }
}
