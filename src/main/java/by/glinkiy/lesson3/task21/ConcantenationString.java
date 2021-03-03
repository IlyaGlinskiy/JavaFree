package by.glinkiy.lesson3.task21;

/**
 * Напишите три цикла выполняющих многократное сложение строк, один с
 * помощью оператора сложения и String, другой с помощью StringBuilder и метода
 * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */

public class ConcantenationString {
    public static void main(String[] args) {
        String string = " Test String";
        StringBuilder stringBuilder = new StringBuilder(" Test String Builder");
        StringBuffer stringBuffer = new StringBuffer(" Test String Buffer");
        for (int i = 0; i < 3; i++) {
            string += " Test String";
            stringBuilder.append(" Test String Builder");
            stringBuffer.append(" Test String Buffer");
        }
        System.out.println(string);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}