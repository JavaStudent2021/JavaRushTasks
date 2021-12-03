package com.javarush.task.jdk13.task09.task0938;

/* 
Двоичная кодировка
*/

public class Solution {
    public static void main(String[] args) {
        String string = "JavaRush";
        string.chars()
                .forEach(Solution::print);
    }

    private static void print(int number) {
        String result = String.format("Номер символа %s в таблице Unicode - %d, а в двоичной системе - %s", (char) number, number, toBinary(number));
        System.out.println(result);
    }

    public static String toBinary(int number) {
        //напишите тут ваш код

            if (number <= 0) return "";
            String d = "";
            while (number != 0) {
                d = number % 2 + d;
                number = number / 2;
            }
            return d;
    }
}
