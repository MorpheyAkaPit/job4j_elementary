package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minAndDiv(double first, double second) {
        return min(first, second)
                / div(first, second);
    }

    public static double sumAllOper(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + min(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат минус и деление равен: " + minAndDiv(10, 20));
        System.out.println("Результат сложения все операций равен: " + sumAllOper(10, 20));
    }
}
