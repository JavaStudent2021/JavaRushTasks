package com.javarush.task.pro.task09.task0917;

/* 
String pool
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));

        int smile = 0x1F600; // Здесь шестнадцатеричный код эмоджи
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toChars(smile)); // Собираем в StringBuilder
        System.out.println("Улыбающееся лицо: " + sb.toString()); // Выводим
    }

    public static boolean equal(String first, String second) {
        //напишите тут ваш код
        String a = first.intern();
        String b = second.intern();

        return a == b;
    }


}
