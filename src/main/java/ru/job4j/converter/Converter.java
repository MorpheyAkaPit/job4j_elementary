package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float inDollars = 120;
        float expectedEuro = 2;
        float expectedDollars = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        float outDollars = Converter.rubleToDollar(inDollars);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollars = expectedDollars == outDollars;
        System.out.println("140 rubles are 2. Test result :" + passedEuro);
        System.out.println("120 rubles are 2. Test result :" + passedDollars);
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollars + " dollars ");
    }
}
