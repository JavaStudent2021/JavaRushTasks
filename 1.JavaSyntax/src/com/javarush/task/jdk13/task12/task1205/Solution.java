package com.javarush.task.jdk13.task12.task1205;

/* 
А мне так нужно
*/

public class Solution {

    private static String UNEXPECTED_TYPE = "Я такого типа числа не жду!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        //напишите тут ваш код
        if (number instanceof Byte) {
            return String.format("%sb",number.byteValue() / 2);
        }else if (number instanceof Integer) {
            return String.format("%s",number.intValue() / 3);
        }else if (number instanceof Double) {
            return String.format("%s",number.doubleValue() *20);
        }else{
            return "Я такого типа числа не жду!";
        }


    }
}
