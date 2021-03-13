package by.glinkiy.lesson2.task13;

import java.util.Random;
/**
 * Создать последовательность случайных чисел, найти и вывести наибольшее
 * из них.
 */

public class BiggestDigitInArray {
    public static void main(String[] args) {
        int[] x = new int[10];
        Random rand = new Random();
        int a = rand.nextInt(20);
        for (int i = 0; i < x.length; i++) {
            x[i]= a;
            a= rand.nextInt(20);

        }
//        for (int a1:x)
//              {
//                  System.out.println(a1);
//        }
        System.out.println("MaxValue in array is " + maxValue(x));

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
}
