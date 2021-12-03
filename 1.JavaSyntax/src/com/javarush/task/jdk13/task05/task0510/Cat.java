package com.javarush.task.jdk13.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name  = null;
    int age;
    int weight;
    String address =null;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 15;
        this.weight = 12;
        this.color = "blue";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 20;
        this.color = "color";
    }

    public void initialize(int weight, String color) {
        this.age = 10;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 5;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
