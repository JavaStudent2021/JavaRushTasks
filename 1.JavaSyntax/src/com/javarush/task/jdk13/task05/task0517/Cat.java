package com.javarush.task.jdk13.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        this.color = "color";
        this.age = 15;
        this.weight = 5;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.color = "red";
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.color = "blue";
        this.age = age;
        this.weight = 5;
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.age = 6;
        this.weight = weight;
    }

    public Cat( int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.age = 8;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
