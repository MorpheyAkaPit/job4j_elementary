package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;
        while (j < array.length - 1) {
            if (array[i + 1] + array[j] != target) {
                i++;
            } else {
                int[] mass = new int[2];
                mass[0] = j;
                mass[1] = i + 1;
                return mass;
            }

            if (i == array.length - 1) {
                j++;
                i = j;
            }
        }
        return new int[0];
    }
}
