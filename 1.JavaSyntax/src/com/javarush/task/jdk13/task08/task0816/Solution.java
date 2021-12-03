package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
            map.put("Сталлоне_1", dateFormat.parse("MAY 1 2012"));
            map.put("Сталлоне_2", dateFormat.parse("JUNE 1 2012"));
            map.put("Сталлоне_3", dateFormat.parse("MAY 1 2012"));
            map.put("Сталлоне_4", dateFormat.parse("JUNE 3 2012"));
            map.put("Сталлоне_5", dateFormat.parse("JULY 1 2012"));
            map.put("Сталлоне_6", dateFormat.parse("AUGUST 1 2012"));
            map.put("Сталлоне_7", dateFormat.parse("MAY 1 2012"));
            map.put("Сталлоне_8", dateFormat.parse("MAY 1 2012"));
            map.put("Сталлоне_9", dateFormat.parse("MAY 1 2012"));

        }
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> map1 = new HashMap<>();
        map1.putAll(map);
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> itr = iterator.next();
            String date = String.valueOf(itr.getValue().getMonth());
            //System.out.println(itr.getKey() +" - " + date);
            if (date.equals("5")) {
                map1.remove(itr.getKey());
            }
            if (date.equals("6")) {
                map1.remove(itr.getKey());
            }
            if (date.equals("7")) {
                map1.remove(itr.getKey());
            }
        }
        map1.forEach((a, b) -> System.out.println(a + " - " + b));
    }

    public static void main(String[] args) {
        try {
            removeAllSummerPeople(createMap());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
