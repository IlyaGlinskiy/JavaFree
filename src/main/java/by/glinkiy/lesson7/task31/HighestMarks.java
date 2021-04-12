package by.glinkiy.lesson7.task31;
/*
Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HighestMarks {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList(10);
        int bestMark = 0;
        for (int i = 0; i < 10; i++) {
            marks.add((int) (Math.random() * 11));
            System.out.print(marks.get(i) + " ");
        }
        System.out.println("");
        Iterator<Integer> marksIterator = marks.iterator();
        while (marksIterator.hasNext()) {
            Integer nextMark = marksIterator.next();
            if (bestMark < nextMark) {
                bestMark = nextMark;
            }
        }
        System.out.println("Best mark : " + bestMark);
    }
}
