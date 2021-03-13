package by.glinkiy.lesson2.task15;

import by.glinkiy.lesson2.task10.FactorialAnyDigit;

/**
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] m = new int[9];
        int r=m.length-1;
        for (int i = 0; i < m.length; i++) {
            m[i] = FactorialAnyDigit.rnd(0, 9);
            System.out.print(m[i]);

        }
        System.out.print(" ");

        while (r>=0){
            System.out.print(m[r]);
            r--;
        }
//        System.out.println();
//        for (int c:reverse(m)) {
//
//            System.out.print(c);
//        }

    }

//    static int [] reverse (int  a[]){
//        Collections.reverse(Arrays.asList(a));
//        return a;
//    }

}
