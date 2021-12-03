package com.javarush.task.jdk13.task05.task0501;

/*
Кошачья бойня(1)
*/

public class Solution {

    public static class Cat {
        //напишите тут ваш код
        private String name;
        private int age;
        private int weight;
        private int strength;

        public boolean fight(Cat cat1) {

            int a = this.age > cat1.age ? 1 : this.age < cat1.age ? -1 : 0;
            int b = this.weight > cat1.weight ? 1 : this.weight < cat1.weight ? -1 : 0;
            int c = this.strength > cat1.strength ? 1 : this.strength < cat1.strength ? -1 : 0;

            return a + b + c > 0 ? true : a + b + c <= 0 ? false : true;
        }

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }

    public static void main(String[] args) {
        Cat cat_1 = new Cat("Vasa", 8, 1, 5);
        Cat cat_2 = new Cat("Tom", 5, 1, 5);
        Cat cat_3 = new Cat("Myrsik", 10, 10, 5);

        System.out.println(cat_1.fight(cat_2));
        System.out.println(cat_1.fight(cat_3));
        System.out.println(cat_2.fight(cat_3));
    }
}
