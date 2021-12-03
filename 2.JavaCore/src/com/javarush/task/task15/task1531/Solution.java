package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        BigDecimal peremnozenie = BigDecimal.ONE;
        BigDecimal multiplier = BigDecimal.ZERO;
        if (n < 0){
            return "0";
        }
        for (long a = (n - (n-1)); a <=n; a++){
            multiplier = BigDecimal.valueOf(a);
            peremnozenie = peremnozenie.multiply(multiplier);
        }
        return String.valueOf(peremnozenie);
    }
    }
