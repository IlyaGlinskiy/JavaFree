package by.glinkiy.lesson5.tast24;

public class TimeUtil {
    public static int convertToSecond(Time time) {
        return time.getHour() * 3600 + time.getMinutes() * 60 + time.getSecond();
    }

    public static Time convertToHour(Time time) {
        int second = time.getSecond() % 60;
        int minutes = ((time.getSecond() - second) / 60) % 60;
        int hour = (((time.getSecond() - second) / 60) - minutes) / 60;
        return new Time(hour, minutes, second);
    }
}
