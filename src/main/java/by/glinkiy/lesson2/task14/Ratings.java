package by.glinkiy.lesson2.task14;

import by.glinkiy.lesson2.task10.FactorialAnyDigit;

/**
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 */
public class Ratings {
    public static void main(String[] args) {
        int[] rt = new int[15];
        for (int i = 0; i < rt.length; i++) {
            rt[i] = FactorialAnyDigit.rnd(0, 100);

        }
        System.out.println("MaxRating is " + maxValue(rt));
        System.out.println("MinRating is " + minValue(rt));
//        for (int a:rt) {
//            System.out.println(a);
//        }

    }

    public static int maxValue(int[] mas) {
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
        }
        return max;
    }

    public static int minValue(int[] mas) {
        int min = 101;
        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
        }
        return min;
    }

}
