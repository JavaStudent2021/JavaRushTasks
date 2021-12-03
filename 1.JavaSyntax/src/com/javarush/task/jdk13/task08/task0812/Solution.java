package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int result = 1;
        int count = 1;
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.valueOf(reader.readLine()));
        }
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i - 1).equals(arrayList.get(i))) {
                count++;
                if (result < count) result = count;
            } else {
                count = 1;
            }
        }
        System.out.println(result);
    }
}
