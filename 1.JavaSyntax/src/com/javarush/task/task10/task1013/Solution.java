package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String firstName;
        private String address;
        private int age;
        private int weight;
        private int height;

        public Human() {

        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String firstName) {
            this.name = name;
            this.firstName = firstName;
        }

        public Human(String name, String firstName, String address) {
            this.name = name;
            this.firstName = firstName;
            this.address = address;
        }

        public Human(String name, String firstName, String address, int age) {
            this.name = name;
            this.firstName = firstName;
            this.address = address;
            this.age = age;
        }

        public Human(String name, String firstName, String address, int age, int weight) {
            this.name = name;
            this.firstName = firstName;
            this.address = address;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String firstName, String address, int age, int weight, int height) {
            this.name = name;
            this.firstName = firstName;
            this.address = address;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int weight, int height) {
            this.name = name;
            this.weight = weight;
            this.height = height;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }


    }
}
