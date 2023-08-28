package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = 0; start + i < finish; i++) {
            if (min > array[start + i + 1]) {
                min = array[start + i + 1];
            }
        }
        return min;
    }
}
