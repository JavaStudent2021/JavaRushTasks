package com.javarush.task.task18.task1804;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream("C:\\DiskD\\jav\\er3.txt");// C:\DiskD\jav\er3.txt
        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int by = fileInputStream.read();
            map.merge(by, 1, (k, v) -> v + k);
        }
        reader.close();
        fileInputStream.close();
        if (!map.isEmpty()){
            int min = Collections.min(map.values());
            map.entrySet().stream().filter(x -> x.getValue() == min).forEach(x -> System.out.print(x.getKey() + " "));
        }


    }
}
