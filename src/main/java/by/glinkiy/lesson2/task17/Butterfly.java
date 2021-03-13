package by.glinkiy.lesson2.task17;

/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
 * таким образом:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
public class Butterfly {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length - i; j++) {
                arr[i][j] = 1;
            }
        }
        for (int j = arr.length - 1; j > arr.length / 2 - 1; j--) {
            for (int h = arr.length - 1 - j; h < arr[j].length - (arr.length - 1 - j); h++) {
                arr[j][h] = 1;
            }
        }

        for (int[] a : arr) {
            for (int x : a) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

