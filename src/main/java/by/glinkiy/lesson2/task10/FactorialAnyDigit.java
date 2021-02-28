package by.glinkiy.lesson2.task10;
/**
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

import java.util.Random;

public class FactorialAnyDigit {
    public static void main(String[] args) {
        int min = 10;
        int max = 15;
        int c = rnd(min, max);
        System.out.println(getFactorial(c));
    }


    public static int getFactorial(int f) {
        int x = 1;
        for (int i = 1; i <= f; i++) {
            x *= i;
        }
        return x;
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) ((Math.random() * ++max) + min);
    }
}
