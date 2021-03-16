package by.glinkiy.lesson5.tast23;

/*
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.
 */
public class FindTags {
    public static void main(String[] args) {
        String text = " <p> All tag will replace to <p id=\"p1\"> <p id=\"b2\"> <p id=\"b3\"> <p>";
        System.out.println(text);
        text = text.replaceAll("\\<p\\s[\\w\\p{Punct}]+\\>", "<p>");
        System.out.println(text);
    }
}
