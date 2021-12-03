package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream adapterToPrintStream = new PrintStream(outputStream);
        System.setOut(adapterToPrintStream);

        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        for (int i = 0; i < result.length(); i++) {
            try {
                System.out.print(Integer.parseInt(String.valueOf(result.charAt(i))));
            } catch (Exception e) {
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
