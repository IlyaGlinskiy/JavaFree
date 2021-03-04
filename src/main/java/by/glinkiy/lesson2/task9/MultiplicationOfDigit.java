package by.glinkiy.lesson2.task9;

/**
 * Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
 * произведение, т.е. факториал числа.
 */
public class MultiplicationOfDigit {
    public static void main(String[] args) {
        int sumMult = 1;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            sumMult *= x;
            x = (int) (Math.random() * 20);
        }
        System.out.println(sumMult);
    }
}
