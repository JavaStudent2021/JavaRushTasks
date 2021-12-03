package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker drinkMaker;
        drinkMaker = new LatteMaker();
        drinkMaker.makeDrink();
        drinkMaker = new TeaMaker();
        drinkMaker.makeDrink();
    }

}
