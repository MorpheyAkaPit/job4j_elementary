package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(
                    "Размер вложенно массива равен: " + array[i].length
            );
        }

    }
}
