package by.glinkiy.lesson2.task7;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */

public class CheckR {
    public static void main(String[] args) {
        int a, b, r;
        a = 10;
        b = 20;
        r = 9;
        if (biggestSide(a, b) < r * 2) {
            System.out.println("Circle will closing of rectangle");
        } else {
            System.out.println("Rectangle more of circle");
        }
    }

    public static int biggestSide(int value1, int value2) {
        if (value1 < value2) {
            return value2;
        } else {
            return value1;
        }
    }
}
