package com.javarush.task.jdk13.task08.task0824;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Вся семья в сборе
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Human son_1 = new Human("son_1", true, 8);
        Human son_2 = new Human("son_2", true, 7);
        Human son_3 = new Human("son_3", true, 5);

        Human fater = new Human("father", true, 40);
        fater.children.add(son_1);
        fater.children.add(son_2);
        fater.children.add(son_3);

        Human mother = new Human("mother", false, 40);
        mother.children.add(son_1);
        mother.children.add(son_2);
        mother.children.add(son_3);

        Human gr_1 = new Human("gr_1", true, 75);
        Human mot_1 = new Human("mot_1", false, 70);
        gr_1.children.add(fater);
        mot_1.children.add(fater);

        Human gr_2 = new Human("gr_2", true, 75);
        Human mot_2 = new Human("mot_2", false, 70);
        gr_2.children.add(mother);
        mot_2.children.add(mother);


        System.out.println(fater);
        System.out.println(mother);


        System.out.println(gr_1);
        System.out.println(mot_1);
        System.out.println(gr_2);
        System.out.println(mot_2);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }



        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
