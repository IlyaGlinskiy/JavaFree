package by.glinkiy.lesson3.task19;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 */

public class WordsInString {
    public static void main(String[] args) {
        String text = "This text for find words in string.It's all! ";
        StringTokenizer st = new StringTokenizer(text, " .,!:;-\n\t\r");
        int wordsCount = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            wordsCount++;
        }
        System.out.println(wordsCount + " words in this string.");

        Pattern pattern = Pattern.compile("\\b\\w+'?\\w\\b");
        Matcher matcher = pattern.matcher(text);
        int words = 0;
        while (matcher.find()) {
            words++;
        }
        System.out.println(words + " words in this string.");
    }
}
