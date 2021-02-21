package ru.geekbraines.lesson1;

public class MainApp {

    public static float calcHomework3(float a, float b, float c, float d) {
        if (d != 0.0f) {
            return a * (b + (c / d));
        } else
            return 0;
    }

    public static boolean intCompare(int a, int b) {
        if ( (a + b >= 10) && (a + b <=20) )
            return true;
        else
            return false;
    }

    public static void signDetect(int a) {
        if (a >= 0)
            System.out.println("Задание 5: на вход передано положительное число");
        else
            System.out.println("Задание 5: на вход передано отрицательное число");
    }

    public static boolean signDetectV2(int a) {
        if (a >= 0)
            return false;
        else
            return true;
    }

    public static void helloName(String name) {
        System.out.println("Привет, " + name);
    }

    public static void yearWiskas(int y) {
        if ( (y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
            System.out.println(y + " год является високосным");
        else
            System.out.println(y + " год не является високосным");
    }

    public static void main(String[] args) {
        byte byteA = 11;
        short shortB = 32000;
        int intC = -123;
        long longD = 12000000L;
        float floatE = 3.43f;
        double doubleF = -32.456789;
        char charG = 'A';
        boolean boolH = true;
        float resHw3 = calcHomework3(5.0f, 4.0f, 6.0f, 2.0f);
        System.out.println("Задание 3: " + resHw3);
        if (intCompare(13,5))
            System.out.println("Задание 4: Для сравнения переданы числа, сумма которых в диапазоне от 10 до 20");
        else
            System.out.println("Задание 4: Для сравнения переданы числа, сумма которых вне диапазона от 10 до 20");
        signDetect(-30);
        if (signDetectV2(intC))
            System.out.println("Задание 6: передано отрицательное число");
        else
            System.out.println("Задание 6: передано положительное число");
        helloName("друг");
        yearWiskas(2100);
    }
}
