package com.javarush.task.jdk13.task07.task0724;

/* 
Семья
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human greatFather_1 = new Human("Tom_1", true, 60);
        Human greatFather_2 = new Human("Tom_2", true, 60);
        Human greatMather_1 = new Human("Jeni_1", false, 58);
        Human greatMather_2 = new Human("Jeni_2", false, 58);

        Human father = new Human("fatherName", true, 40, greatFather_1, greatMather_1);
        Human mother = new Human("motherName", false, 38, greatFather_2, greatMather_2);

        Human Jon_1 = new Human("Rex_1", true, 15, father, mother);
        Human Jon_2 = new Human("Rex_2", false, 10, father, mother);
        Human Jon_3 = new Human("Rex_3", true, 7, father, mother);

        System.out.println(greatFather_1);
        System.out.println(greatFather_2);
        System.out.println(greatMather_1);
        System.out.println(greatMather_2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(Jon_1);
        System.out.println(Jon_2);
        System.out.println(Jon_3);

    }

    public static class Human {
        // напишите тут ваш код
        Human father;
        Human mother;
        String name;
        boolean sex;
        int age;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.father = father;
            this.mother = mother;
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}