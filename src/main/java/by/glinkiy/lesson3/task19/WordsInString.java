package by.glinkiy.lesson3.task19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.W;

/**
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 */

public class WordsInString {
    public static void main(String[] args) {
        String text = "This text for find words in string.It's all! ";
        Pattern pattern = Pattern.compile("\\b\\w+'?\\w\\b");
        Matcher matcher = pattern.matcher(text);
        int words=0;
        while (matcher.find()){
            words++;
        }
        System.out.println(words + " words in this sting.");
    }

}
