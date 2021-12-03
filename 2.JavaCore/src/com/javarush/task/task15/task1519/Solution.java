package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        while (!n.equals("exit")) {

            try {
                int w = Integer.parseInt(n);
                if (w > 0 && w < 128) {
                    print(Short.parseShort(n));
                } else if (w <= 0 || 128 <= w) {
                    print(Integer.parseInt(n));
                }
            } catch (NumberFormatException e) {
                if (n.contains(".")) {
                    try {
                        print(Double.parseDouble(n));
                    }catch (NumberFormatException r){
                        print(n);
                    }
                } else {
                    print(n);
                }
            }
            n = reader.readLine();
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
