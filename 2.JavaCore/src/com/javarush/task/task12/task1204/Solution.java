package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        String r;
        switch (o.getClass().getSimpleName()) {
            case "Cat":
                r = "Кошка";
                break;
            case "Bird":
                r = "Птица";
                break;
            case "Lamp":
                r = "Лампа";
                break;
            case "Dog":
                r = "Собака";
                break;
            default:
                r = "Бла..Блаа";
        }
        System.out.println(r);

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
