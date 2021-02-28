package by.glinkiy.lesson1.task3;
/**
 * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 * А) минут + секунд,
 * В) часов + минут + секунд,
 * С) дней + часов + минут + секунд,
 * D) недель + дней + часов + минут + секунд.
 * по аналогии с примером выше.
 */
public class Time {
    public static void main(String[] args) {
        System.out.println(minAndSecond(4500));
        System.out.println(hourMinSec(4500));
        System.out.println(day(4500));
        System.out.println(weeks(4500));


    }

    public static String minAndSecond(int value) {
        int second = value;
        int remains = second % 60;
        int min = (second - remains) / 60;
        String s = min + " минут" + " " + remains + " секунд";
        return s;

    }

    public static String hourMinSec(int value) {
        int second = value;
        int remains = second % 60;
        int min = (second - remains) / 60;
        int rmin = min % 60;
        int hour = (min - rmin) / 60;
        String s = hour + " часов " + rmin + " минут " + remains + " секунд";
        return s;
    }

    public static String day(int value) {
        int second = value;
        int remains = second % 60;
        int min = (second - remains) / 60;
        int rmin = min % 60;
        int hour = (min - rmin) / 60;
        int rhour = hour % 24;
        int day = (hour - rhour) / 24;
        String s = day + " дней " + rhour + " часов " + rmin + " минут " + remains + " секунд";
        return s;
    }
    public static String weeks(int value){
        int second = value;
        int remains = second % 60;
        int min = (second - remains) / 60;
        int rmin = min % 60;
        int hour = (min - rmin) / 60;
        int rhour = hour % 24;
        int day = (hour - rhour) / 24;
        int rday=day%7;
        int week = (day-rday)/7;
        String s = week + " недель " + rday + " дней " + rhour + " часов " + rmin + " минут " + remains + " секунд";
        return s;
    }

}
