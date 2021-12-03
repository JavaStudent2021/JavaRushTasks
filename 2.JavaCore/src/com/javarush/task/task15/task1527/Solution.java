package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] str = new String[1];
        for (String s : line.split("\\?")) {
            str[0] = s;
        }

        for (String w : str[0].split("\\&")) {
            String[] m = w.split("\\=");
            System.out.print(m[0]+ " ");
        }
        System.out.println();
        for (String w : str[0].split("\\&")) {
            String[] m = w.split("\\=");
            if (m[0].contains("obj")){
                try {
                    alert(Double.parseDouble(m[1]));
                }catch (ArithmeticException e){
                    alert(m[1]);
                }catch (NumberFormatException e){
                    alert(m[1]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
