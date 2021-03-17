package by.glinkiy.lesson5.tast26;
/*
Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */
public class HomeAppliances {
    private int length;
    private int width;
    private int height;

    public HomeAppliances(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
