package by.glinkiy.lesson3.task20;

/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */

public class SumEndLetters {
    public static void main(String[] args) {
        String text = "    This text for calculate and print last word's letter. It's all.   ";
        String[] split = text.split("[\\s\\.,!:;\\-\\t\\n]");
        for (String s : split
        ) {
            if (!s.isEmpty()) {
                System.out.println(s);
            }
        }
    }
}
