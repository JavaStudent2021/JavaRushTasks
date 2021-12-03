package com.javarush.task.jdk13.task09.task0941;

/* 
IPv6
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map("2001:db8:11a3:9d7:1f34:8a2e:7a0:765d")));
    }

    public static String[] map(String ipv6) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(ipv6,":");
        String [] f = new String[tokenizer.countTokens()];
        int t = 0;
        while (tokenizer.hasMoreTokens()){
            f[t++] = tokenizer.nextToken();
        }
        return f;
    }
}
