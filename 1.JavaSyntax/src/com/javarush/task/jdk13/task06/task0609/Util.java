package com.javarush.task.jdk13.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double a1 = Math.pow((x2 - x1), 2);
        double b1 = Math.pow((y2 - y1), 2);
        return Math.sqrt(a1 + b1);
    }

    public static void main(String[] args) {

    }
}
