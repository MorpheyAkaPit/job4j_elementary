package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[]{0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMin7from9() {
        int[] array = new int[]{10, 7, 15, 34, 12, 64, 14, 22, 11};
        int result = Min.findMin(array);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}