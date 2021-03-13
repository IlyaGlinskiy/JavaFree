package by.glinkiy.lesson2.task14;

import by.glinkiy.lesson2.task10.FactorialAnyDigit;

/**
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 */
public class Ratings {
    public static void main(String[] args) {
        int[] rating = new int[15];
        for (int i = 0; i < rating.length; i++) {
            rating[i] = FactorialAnyDigit.rnd(0, 100);
            System.out.print(rating[i] + " ");
        }
        System.out.println("");
        System.out.println(maxRating(rating));
        System.out.println("");
        System.out.println(minRating(rating));
    }

    public static String maxRating(int[] rating) {
        int max = 0;
        int maxIndex = 0;
        for (int numbers : rating) {
            if (max < numbers) {
                max = numbers;
            }
        }
        for (int i = 0; i < rating.length; i++) {
            if (rating[i] == max) {
                maxIndex = i;
                System.out.println("MinIndex= " + maxIndex);
            }
        }
        return "MaxRating is " + max + ".";
    }

    public static String minRating(int[] rating) {
        int min = 101;
        int minIndex = 0;
        for (int numbers : rating) {
            if (min > numbers) {
                min = numbers;
            }
        }
        for (int i = 0; i < rating.length; i++) {
            if (rating[i] == min) {
                minIndex = i;
                System.out.println("MinIndex= " + minIndex);
            }
        }
        return "MinRating is " + min + ".";
    }
}
