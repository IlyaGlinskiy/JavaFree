package by.glinkiy.lesson3.task20;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */

public class SumEndLetters {
    public static void main(String[] args) {
        String text = "    This text for calculate and print last word's letter. It's all.   ";
        StringTokenizer st = new StringTokenizer(text, " .,!:;-\n\t\r");
        int wordsCount = 0;
        while (st.hasMoreTokens()) {
            char[] chArray = st.nextToken().toCharArray();
            System.out.print(chArray[chArray.length - 1]);
            wordsCount++;
        }
        String[] split = text.split("[\\s\\.,!:;\\-\\t\\n]");
        for (String s : split
        ) {
            if (!s.isEmpty()) {
                System.out.println(s);
            }
        }
    }
}
