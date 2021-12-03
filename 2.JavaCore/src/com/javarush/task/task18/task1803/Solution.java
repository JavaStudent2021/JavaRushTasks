package com.javarush.task.task18.task1803;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int r = fileInputStream.read();
            map.merge(r, 1, (k, v) -> k + v);
        }
        reader.close();
        fileInputStream.close();
        int max = Collections.max(map.values());
        map.entrySet().stream().filter(x -> x.getValue() == max).forEach(x -> System.out.print(x.getKey() + " "));


    }
}
