package com.javarush.task.jdk13.task06.task0633;

/* 
Вырезаем середину
*/

public class Solution {
    public static char[][] chars;


    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (i == 0 || i == chars.length - 1 || j == 0 || j == chars[i].length - 1) {
                    continue;
                } else {
                    chars[i][j] = '-';
                }
            }
        }
    }
}
