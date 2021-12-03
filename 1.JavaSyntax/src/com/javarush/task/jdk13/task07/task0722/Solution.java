package com.javarush.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        String stop = reader.readLine();
        while (!stop.equals("end")){
            list.add(stop);
            stop = reader.readLine();
        }
        list.forEach(System.out::println);
    }
}