package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("L_" + i, 80 * i);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            Integer itr = iterator.next();
            if (itr <500) iterator.remove();
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}