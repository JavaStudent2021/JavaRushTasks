package com.javarush.task.pro.task09.task0906;

/*
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 232;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "11101000";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код

        if (decimalNumber <= 0) return "";
        String d = "";
        while (decimalNumber != 0) {
            d = decimalNumber % 2 + d;
            decimalNumber = decimalNumber / 2;
        }
        return d;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        int g = 0;
        int t = 0;
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        } else {
            for (int i = binaryNumber.length() - 1; i >= 0; i--) {
                int f = Character.getNumericValue(binaryNumber.charAt(i));
                g = (int) (g+ (f * Math.pow(2, t++)));
            }
            return g;
        }
    }

}
