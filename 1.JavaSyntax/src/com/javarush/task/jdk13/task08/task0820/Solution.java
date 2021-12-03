package com.javarush.task.jdk13.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        Cat cat_1 = new Cat();
        Cat cat_2 = new Cat();
        Cat cat_3 = new Cat();
        Cat cat_4 = new Cat();

        result.add(cat_1);
        result.add(cat_2);
        result.add(cat_3);
        result.add(cat_4);

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> sets = new HashSet<>();
        Dog dog_1 = new Dog();
        Dog dog_2 = new Dog();
        Dog dog_3 = new Dog();

        sets.add(dog_1);
        sets.add(dog_2);
        sets.add(dog_3);
        return sets;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object>copy = new HashSet<>();
        copy.addAll(pets);
        for (Object f: copy) {
            for (Cat c :cats) {
                if (f == c){
                    pets.remove(f);
                }
            }

        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        pets.forEach(s-> System.out.println(s));
    }

    //напишите тут ваш код
    public static class Cat{
        public Cat() {}
    }
    public static class Dog{
        public Dog() {}
    }
}
