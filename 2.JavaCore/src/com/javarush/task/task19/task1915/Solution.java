package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFile = reader.readLine(); // C:\\DiskD\\jav\\er3.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(nameFile);

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        System.setOut(consoleStream);


        System.out.println(result);
        fileOutputStream.write(result.getBytes());

        fileOutputStream.flush();
        fileOutputStream.close();
        reader.close();


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

