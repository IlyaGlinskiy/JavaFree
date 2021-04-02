package by.glinkiy.lesson3.game;

import java.util.Scanner;

public class NoughtsAndCrosses {
    public static void main(String[] args) {
        //          a 1 2 3    b  1  2  3     c  1  2  3
        //0|1|2|3 4 5|6|7|8 9 10|11|12|13 14 15|16|17|18
        StringBuilder field = new StringBuilder(" 123\na___\nb___\nc___");
        System.out.println("You starting game NoughtsAndCrosses!\nIn game use first strings and second columns! Example:a1,b2,c3. Begin \"O\"\nLet's go!");
        System.out.println(field);

        for (int i = 0; i < 9; i++) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            char[] arr = input.toCharArray();

            if (arr.length == 2 && ((arr[0] == 'a' || arr[0] == 'b' || arr[0] == 'c') &&
                    (arr[1] == '1' || arr[1] == '2' || arr[1] == '3'))) {

                if (arr[0] == 'a' && arr[1] == '1') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(6, 7, "X");
                    } else field.replace(6, 7, "O");
                }

                if (arr[0] == 'a' && arr[1] == '2') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(7, 8, "X");
                    } else field.replace(7, 8, "O");
                }

                if (arr[0] == 'a' && arr[1] == '3') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(8, 9, "X");
                    } else field.replace(8, 9, "O");
                }

                if (arr[0] == 'b' && arr[1] == '1') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(11, 12, "X");
                    } else field.replace(11, 12, "O");
                }

                if (arr[0] == 'b' && arr[1] == '2') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(12, 13, "X");
                    } else field.replace(12, 13, "O");
                }

                if (arr[0] == 'b' && arr[1] == '3') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(13, 14, "X");
                    } else field.replace(13, 14, "O");
                }

                if (arr[0] == 'c' && arr[1] == '1') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(16, 17, "X");
                    } else field.replace(16, 17, "O");
                }

                if (arr[0] == 'c' && arr[1] == '2') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(17, 18, "X");
                    } else field.replace(17, 18, "O");
                }

                if (arr[0] == 'c' && arr[1] == '3') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(18, 19, "X");
                    } else field.replace(18, 19, "O");
                }

                System.out.println(field);

                //Check for winner
                char[] check = field.toString().toCharArray();
                if ((check[6] == 'O' && check[7] == 'O' && check[8] == 'O') ||
                        (check[11] == 'O' && check[12] == 'O' && check[13] == 'O') ||
                        (check[16] == 'O' && check[17] == 'O' && check[18] == 'O') ||
                        (check[6] == 'O' && check[11] == 'O' && check[16] == 'O') ||
                        (check[7] == 'O' && check[12] == 'O' && check[17] == 'O') ||
                        (check[8] == 'O' && check[13] == 'O' && check[18] == 'O') ||
                        (check[6] == 'O' && check[12] == 'O' && check[18] == 'O') ||
                        (check[8] == 'O' && check[12] == 'O' && check[16] == 'O')) {
                    System.out.println("\"O\" Won! Congratulations!");
                    break;
                } else if ((check[6] == 'X' && check[7] == 'X' && check[8] == 'X') ||
                        (check[11] == 'X' && check[12] == 'X' && check[13] == 'X') ||
                        (check[16] == 'X' && check[17] == 'X' && check[18] == 'X') ||
                        (check[6] == 'X' && check[11] == 'X' && check[16] == 'X') ||
                        (check[7] == 'X' && check[12] == 'X' && check[17] == 'X') ||
                        (check[8] == 'X' && check[13] == 'X' && check[18] == 'X') ||
                        (check[6] == 'X' && check[12] == 'X' && check[18] == 'X') ||
                        (check[8] == 'X' && check[12] == 'X' && check[16] == 'X')) {
                    System.out.println("\"X\" Won! Congratulations!");
                    break;
                } else System.out.println("Friendship won!");

            } else {
                System.out.println("You used incorrect character! Please try again.");
                i--;
                continue;
            }
        }
    }
}