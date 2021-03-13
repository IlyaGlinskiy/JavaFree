package by.glinkiy.lesson2.task7;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */

public class CheckR {
    public static void main(String[] args) {
        int width, length, radius;
        width = 10;
        length = 20;
        radius = 9;
        if (biggestSide(width, length) < radius * 2) {
            System.out.println("Circle will closing of rectangle");
        } else {
            System.out.println("Rectangle more of circle");
        }
    }

    public static int biggestSide(int width, int length) {
        if (width < length) {
            return length;
        } else {
            return width;
        }
    }
}
