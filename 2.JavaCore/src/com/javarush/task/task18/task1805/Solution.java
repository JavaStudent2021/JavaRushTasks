package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine()); // "C:\\DiskD\\jav\\er4.txt"

        Map<Integer, Integer> map = new HashMap<>();
        while (fileInputStream.available() > 0) {
            int r = fileInputStream.read();
            map.merge(r, 1, (k, v) -> k + v);
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> System.out.print(x.getKey() + " "));

        reader.close();
        fileInputStream.close();
    }
}
