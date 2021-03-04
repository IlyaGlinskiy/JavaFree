package by.glinkiy.lesson2.task8;

import java.util.Random;

/**
 * Имеется целове число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в  правильном падеже.
 */
public class Rubles {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt();
        if (randomNumber < 0) {
            randomNumber *= -1;
        }
        System.out.println(randomNumber + rubTr(randomNumber));
    }

    public static String rubTr(int value) {
        if (value == 1 || value % 10 == 1) {
            return " рубль";
        } else if (value > 1 && value < 5 || value % 10 >= 2 && value % 10 <= 4) {
            return " рубля";
        } else return " рублей";
    }
}