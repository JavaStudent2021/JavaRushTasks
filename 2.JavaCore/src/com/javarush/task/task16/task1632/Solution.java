package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new Thread_1()));
        threads.add(new Thread(new Thread_2()));
        threads.add(new Thread(new Thread_3()));
        threads.add(new Thread(new Thread_4()));
        threads.add(new Thread(new Thread_5()));
    }

    public static void main(String[] args) {
        threads.get(4).start();
        System.out.println(threads.get(4).isAlive());

    }
}