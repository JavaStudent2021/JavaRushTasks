package com.javarush.task.task18.task1821;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader bufferedReader = new FileReader(args[0]);
        Map<Character, Integer> map = new TreeMap<>();
        while (bufferedReader.ready()){
            char abc = (char) bufferedReader.read();
            map.merge(abc,1,(k,n)->k + n++);
        }
        map.entrySet().forEach((k)-> System.out.println(k.getKey() +" "+k.getValue()));
        bufferedReader.close();
    }

}
