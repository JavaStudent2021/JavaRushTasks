package com.javarush.task.jdk13.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(String.format("%3$s%2$s%s","Мама", "Мыла", "Раму"));
        System.out.println(String.format("%3$s%s%2$s","Мама", "Мыла", "Раму"));
        System.out.println(String.format("%s%2$s%3$s","Мама", "Мыла", "Раму"));
        System.out.println(String.format("%2$s%3$s%s","Мама", "Мыла", "Раму"));
        System.out.println(String.format("%s%3$s%2$s","Мама", "Мыла", "Раму"));
        System.out.println(String.format("%2$s%s%3$s","Мама", "Мыла", "Раму"));
    }
}
