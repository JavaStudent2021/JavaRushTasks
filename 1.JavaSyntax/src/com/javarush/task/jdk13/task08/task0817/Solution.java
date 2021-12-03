package com.javarush.task.jdk13.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Удалить людей, имеющих одинаковые имена
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            map.put("L_" + i, "F_" + i);
        }
        map.put("L_" + 10, "F_" + 2);
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, Integer> map1 = new HashMap<>();
        for (Map.Entry s : map.entrySet()) {
            map1.merge(String.valueOf(s.getValue()), 1,(a, b) -> ++b);
        }
        for (Map.Entry s : map1.entrySet()) {
            if (!s.getValue().equals(1)) {
                removeItemFromMapByValue(map, String.valueOf(s.getKey()));
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
