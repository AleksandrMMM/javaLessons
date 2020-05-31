package com.lessons.lessons1;

import java.util.Arrays;

public class homeWork1 {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};


        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i - 1];
                array[i-1] = array[i];
                array[i] = temp;

            } else {

            }

        }
        String intArrayString = Arrays.toString(array);
        System.out.println(intArrayString);
    }
}
