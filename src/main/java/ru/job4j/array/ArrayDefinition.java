package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        names[0] = "Оля";
        names[1] = "Коля";
        names[2] = "Помидоры";
        names[3] = "Любовь";
        float[] prices = new float[40];
        System.out.println("Число ячеек ages " + ages.length);
        System.out.println("Число ячеек surnames " + names.length);
        System.out.println("Число ячеек prices " + prices.length);
        System.out.println(names[0] + " + " + names[1] + " + " + names[2] + " = " + names[3]);
    }
}
