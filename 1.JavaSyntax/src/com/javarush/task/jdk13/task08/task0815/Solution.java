package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("F_" + i, "L_" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int result = 0;
        for (Map.Entry v : map.entrySet()) if (v.getValue().equals(name)) result++;
        return result;
}

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int result_Last = 0;
        for (Map.Entry v : map.entrySet()) if (v.getKey().equals(lastName)) result_Last++;
        return result_Last;
    }

    public static void main(String[] args) {

    }
}
