package by.glinkiy.lesson7.task32;

import java.util.*;

/*
Имеется текст. Следует составить для него частотный словарь.
 */
public class ArequencyDictionary {
    public static void main(String[] args) {
        String text = "Christmas is one of the most popular holidays on the planet. It seems strange but not everybody " +
                "celebrate such a great holiday. It depends on the religion and the culture of people. So, who does not" +
                " celebrate this holiday?\n" +
                "\n" +
                "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. So people who are" +
                " neither Christian nor believers don’t have holiday mood on this day.";
        List<String> list = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(text, " !?.:(),;-{}\"\n");
        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }
        Map<String, Integer> words = new HashMap<>();
        for (String str : list) {
            if (words.containsKey(str)) {
                int count = words.get(str);
                words.put(str, count + 1);
            } else {
                words.put(str, 1);
            }
        }

        int countWords = 0;
        for (Map.Entry<String, Integer> map : words.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
            countWords += map.getValue();
        }
    }
}
