package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int y = 0;
        for (int n = money - price; n > 0; y++) {
            while (n >= coins[y]) {
                rsl[size] = coins[y];
                size++;
                n = n - coins[y];
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
