package by.glinkiy.lesson2.task11;

/**
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class SimpleNumbers {
    public static void main(String[] args) {
        int x = 9;

        System.out.println("Is number simple? " + isSimple(x));
    }

    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;

    }
}