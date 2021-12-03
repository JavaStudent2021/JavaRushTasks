package com.javarush.task.jdk13.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        printCats(cats);
        for (Cat d : cats) {
            cats.remove(d);
            break;
        }
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();
        Cat cat_1 = new Cat();
        Cat cat_2 = new Cat();
        Cat cat_3 = new Cat();
        cats.add(cat_1);
        cats.add(cat_2);
        cats.add(cat_3);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        cats.forEach(s -> System.out.println(s.getClass()));
    }

    // step 1 - пункт 1

    public static class Cat {
        public Cat() {
        }
    }
}
