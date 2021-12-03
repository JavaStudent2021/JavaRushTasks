package com.javarush.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 различных строк в списке
*/

public class Solution {
    
    public static ArrayList<String> list;
    
    public static void main(String[] args) {
        //напишите тут ваш код
        list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("Q"+i);
        }
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
