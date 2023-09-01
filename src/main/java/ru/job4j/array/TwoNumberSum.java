package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;
        while (j < array.length - 1) {
            if (array[i + 1] + array[j] != target) {
                i++;
            } else {
                int[] mas = new int[2];
                mas[0] = j;
                mas[1] = i + 1;
                return mas;
            }

            if (i == array.length - 1) {
                j++;
                i = j;
            }
        }
        return new int[0];
    }
}
