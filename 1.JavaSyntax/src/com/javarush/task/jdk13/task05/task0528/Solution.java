package com.javarush.task.jdk13.task05.task0528;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        GregorianCalendar date = new GregorianCalendar();

        DateFormat df = new SimpleDateFormat("dd MM yyyy");
        System.out.println(df.format(date.getTime()));
    }
}
