package com.javarush.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        // напишите тут ваш код
        int[] r = inputArray.clone();
        Arrays.sort(r);
        int min = r[0];
        int max = r[r.length - 1];
        int a = 0, b = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (min == inputArray[i]) a = i;
            if (max == inputArray[i]) b = i;
        }

        return new Pair<Integer, Integer>(inputArray[a], inputArray[b]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
