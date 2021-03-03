package by.glinkiy.lesson3.task18;

/**
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMarks {
    private static String text = "This text need from check punctuation marks! It's all.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^'\\P{Punct}]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count + " Marks in this text");
    }
}
