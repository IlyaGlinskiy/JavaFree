package by.glinkiy.lesson1.task4;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 любого 4-х значного натурального числа n.
 */
public class Reverse {
    public static void main(String[] args) {
        int a= 1234;
        for (int i = 0; i < 4; i++) {
            System.out.print(a%10);
            int t=a/10;
            a=t;


        }


    }
}