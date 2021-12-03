package com.javarush.task.jdk13.task05.task0511;

/* 
Заполнить класс Dog
*/

public class Dog {
    //напишите тут ваш код
    String name, color;
    int height;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
