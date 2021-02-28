package by.glinkiy.lesson1.task5;
/**
 * Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
 * различны?
 */

public class NumberEqual {

    public static void main(String[] args) {
        int a = 3332;
        String b = String.valueOf(a);
        char[] m = b.toCharArray();
        System.out.println("Digit equal? " + equalsNumber(m));
    }


    public static boolean equalsNumber(char[] value) {
        for (char c : value) {
            if (value[0] != c) {
                return false;
            }
        }
        return true;
    }
}