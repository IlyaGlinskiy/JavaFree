package by.glinkiy.lesson2.task16;

/**
 * Определите сумму элементов одномерного массива, расположенных между
 * минимальным и максимальным значениями.
 */

public class SumBetweenNum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 0, 3, 4, 10, 2};
        System.out.println("Sum digit between min and max = " + sumBetween(arr));

    }

    public static int sumBetween(int[] value) {
        int x = 0;
        int result = 0;
        int minIndex = findMinIndex(value);
        int maxIndex = findMaxIndex(value);
        if (maxIndex < minIndex) {
            x = maxIndex;
            maxIndex = minIndex;
            minIndex = x;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += value[i];
        }
        return result;
    }

    public static int findMaxIndex(int[] x) {
        int maxIndex = 0;
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMinIndex(int[] x1) {
        int minIndex = 0;
        int min = x1[0];
        for (int i = 0; i < x1.length; i++) {
            if (min > x1[i]) {
                min = x1[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}