package by.glinkiy.lesson3.task18;

/**
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */

public class FindMarks {
    private static String text = "This text need from check punctuation marks! It's all.";

    public static void main(String[] args) {
        char[] arrChars = text.toCharArray();
        int countMarks = 0;
        for (int i = 0; i < arrChars.length; i++) {
            if (arrChars[i] == ',' || arrChars[i] == '.' || arrChars[i] == ';' || arrChars[i] == ':' || arrChars[i] == '!' || arrChars[i] == '-' || arrChars[i] == '?' || arrChars[i] == '"' || arrChars[i] == '(' || arrChars[i] == ')') {
                countMarks++;
            }
        }
        System.out.println(countMarks + " Marks in this text");
    }
}

