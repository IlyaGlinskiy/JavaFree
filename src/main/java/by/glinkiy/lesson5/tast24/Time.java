package by.glinkiy.lesson5.tast24;

public class Time implements Comparable<Time> {
    private int hour;
    private int minutes;
    private int second;

    public Time(int second) {
        this.second = second;
    }

    public Time(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public int compareTo(Time o) {
        if (TimeUtil.convertToSecond(this) == TimeUtil.convertToSecond(o)) {
            return 0;
        } else if (TimeUtil.convertToSecond(this) > TimeUtil.convertToSecond(o)) {
            return 1;
        } else return -1;
    }
}
