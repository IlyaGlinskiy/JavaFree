package by.glinkiy.lesson3.game;

import java.util.Scanner;

public class NoughtsAndCrosses {
    public static void main(String[] args) {
        //0|1|2|3  4|5|6|7  8|9|10|11 12|13|14|15
        StringBuilder field = new StringBuilder(" 123\na___\nb___\nc___");
        System.out.println("You starting game NoughtsAndCrosses!\nIn game use first strings and second columns! Example:a1,b2,c3. Begin \"O\"\n Are you ready? yes/no");
        System.out.println(field);
        Scanner choose = new Scanner(System.in);
        String s = choose.nextLine();

        if (s.equals("yes")) {
            System.out.println("Begin this game!");
            for (int i = 0; i < 3; i++) {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                char[] arr = input.toCharArray();
                if (arr[0] == 'a' && arr[1] == '1') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(6, 7, "X");
                    } else {
                        field.replace(6, 7, "O");
                    }
                }
                if (arr[0] == 'a' && arr[1] == '2') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(7, 8, "X");
                    } else {
                        field.replace(7, 8, "O");
                    }
                }
                if (arr[0] == 'a' && arr[1] == '3') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(8, 9, "X");
                    } else {
                        field.replace(8, 9, "O");
                    }
                }
                if (arr[0] == 'b' && arr[1] == '1') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(11, 12, "X");
                    } else {
                        field.replace(11, 12, "O");
                    }
                }
                if (arr[0] == 'b' && arr[1] == '2') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(12, 13, "X");
                    } else {
                        field.replace(12, 13, "O");
                    }
                }
                if (arr[0] == 'b' && arr[1] == '3') {
                    if (i == 1 || i % 2 != 0) {
                        field.replace(13, 14, "X");
                    } else {
                        field.replace(13, 14, "O");
                    }
                }
                System.out.println(field);
            }
        } else if (s.equals("no")) {
            System.out.println("Come again when you're ready :)");
        } else {
            System.out.println("You entered didn't right characters. Start is this game again.");
        }
    }
}
