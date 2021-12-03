package com.javarush.task.jdk13.task05.task0514;

/* 
Инициализация объектов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("Vasa", 15);
    }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;

        public void initialize (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
