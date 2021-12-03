package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        String str = reader.readLine();
        while (str.equals("user") || str.equals("loser") || str.equals("coder") || str.equals("proger")) {
            if (str.equals("user")) doWork(new Person.User());
            if (str.equals("loser"))doWork(new Person.Loser());
            if (str.equals("coder")) doWork(new Person.Coder());
            if (str.equals("proger"))doWork(new Person.Proger());
            str = reader.readLine();
        }
        {
            //создаем объект, пункт 2

            //doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User)((Person.User) person).live();
        if (person instanceof Person.Loser)((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder)((Person.Coder) person).writeCode();
        if (person instanceof Person.Proger)((Person.Proger) person).enjoy();
    }
}
