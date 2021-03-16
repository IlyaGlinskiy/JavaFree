package by.glinkiy.lesson5.tast22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.
 */
public class FindDigit {
    public static void main(String[] args) {
        String text = "qweqwe 123 0xAB 0x0012 e43t ";
        Pattern pattern = Pattern.compile("0x[\\dA-Fa-f]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(),matcher.end()));
        }
    }
}
