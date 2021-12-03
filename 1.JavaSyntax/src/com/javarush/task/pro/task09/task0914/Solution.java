package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        String[] st = path.split("/");
        String r = "";
        for (int i = 0; i < st.length; i++) {
            if (i == 3) {
                r = r + jdk+"/";
            } else if (i == st.length-1){
                r = r + st[i];
            }else {
                r = r + st[i]+"/";
            }
        }
        return r;
    }
}
