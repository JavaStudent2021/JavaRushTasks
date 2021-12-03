package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        int[] arr_2 = new int[array.length];
        int t = 0;
        for (int i = array.length-1; i >= 0; i--) {
            arr_2[t++] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arr_2[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
