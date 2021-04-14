package by.glinkiy.lesson7.task29;
/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMarks {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList(10);
        List<Integer> ind = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            marks.add((int) (Math.random() * 21) - 10);
            if (marks.get(i) < 0) {
                ind.add(i);
            }

            System.out.print(marks.get(i) + " ");

        }
        System.out.println("");
        System.out.println("Marks list size: " + marks.size());
        System.out.println("Negative index mark count: " + ind.size());
        for (int i = 0; i < ind.size(); i++) {
            marks.remove(ind.get(i) - i);
        }


        for (int x : marks) {
            System.out.print(x + " ");
        }
    }

}
