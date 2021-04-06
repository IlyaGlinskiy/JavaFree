package by.glinkiy.lesson5.tast24;
/*
Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.
 */
public class TimeMain {
    public static void main(String[] args) {

        Time time = new Time(3661);
        Time time1 = new Time(1, 1, 1);
        time = TimeUtil.convertToHour(time);
        System.out.println("Hour: " + time.getHour() + "; Minutes: " + time.getMinutes() + "; Second: " + time.getSecond() + ".");
        System.out.println(time.compareTo(time1));
    }
}
