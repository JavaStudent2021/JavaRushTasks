package com.javarush.task.pro.task09.task0905;

import java.util.ArrayList;
import java.util.regex.Pattern;

/*
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int i = 0;
        int decNumb = 0;
        while (decimalNumber != 0) {
            decNumb = (int) (decNumb + (decimalNumber % 8) * Math.pow(10, i++));
            decimalNumber = decimalNumber / 8;
        }
        return decNumb <= 0 ? 0 : decNumb;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int i = 0;
        int decNumb = 0;
        while (octalNumber != 0) {
            decNumb = (int) (decNumb + (octalNumber % 10) * Math.pow(8, i++));
            octalNumber = octalNumber / 10;
        }
        return decNumb <= 0 ? 0 : decNumb;
    }
}
