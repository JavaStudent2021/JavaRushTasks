package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream adapterToPrintStream = new PrintStream(outputStream);
        System.setOut(adapterToPrintStream);

        testString.printSomething();
        System.setOut(consoleStream);
        String result = outputStream.toString();

        result = result.replaceAll("[\\p{Space}=]", "");
        String[]str = result.split("[+*-]");



        int x = 0;
        String line = "";
        char znak = '0';
        int[] st = new int[2];

        for (int i = 0; i < result.length(); i++) {
            char w = result.charAt(i);
            if (w == '+' || w == '-' || w == '*') {
                st[1] = Integer.parseInt(line);
                if (znak == '+') {
                    st[0] = sum(st[0], st[1]);
                    line = "";
                    znak = w;
                } else if (znak == '-') {
                    st[0] = minus(st[0], st[1]);
                    line = "";
                    znak = w;
                } else if (znak == '*') {
                    st[0] = mnoj(st[0], st[1]);
                    line = "";
                    znak = w;
                } else {
                    st[0] = st[1];
                    line = "";
                    znak = w;
                }
            } else {
                line += w;
            }
        }

        st[1] = Integer.parseInt(line);
        if (znak == '+') {
            st[0] = sum(st[0], st[1]);
        } else if (znak == '-') {
            st[0] = minus(st[0], st[1]);
        } else if (znak == '*') {
            st[0] = mnoj(st[0], st[1]);
        }

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
            if(i<str.length-1)System.out.print(znak + " ");
        }
        System.out.println("= " +st[0]);

    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int mnoj(int a, int b) {
        return a * b;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 =");
        }
    }
}

