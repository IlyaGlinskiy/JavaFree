package by.glinkiy.lesson2.task12;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class DivisionOnThree {
    public static void main(String[] args) {
        int x = 10;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
