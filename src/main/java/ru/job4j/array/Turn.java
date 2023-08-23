package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int n = 0; array.length > n * 2; n++) {
            int temp = array[n];
            array[n] = array[array.length - n - 1];
            array[array.length - n - 1] = temp;
        }
        return array;
    }
}