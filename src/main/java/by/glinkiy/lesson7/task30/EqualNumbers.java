package by.glinkiy.lesson7.task30;

import java.util.ArrayList;
import java.util.List;

/*
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.
 */
public class EqualNumbers {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            number.add((int) (Math.random() * 11));
            System.out.print(number.get(i) + " ");
        }
        for (int i = 0; i < number.size() - 1; i++) {
            for (int j = i + 1; j < number.size(); j++) {
                if (number.get(i) == number.get(j)) {
                    number.remove(j);
                }
            }
        }

        System.out.println("");
        for (int x : number
        ) {
            System.out.print(x + " ");

        }
    }
}
