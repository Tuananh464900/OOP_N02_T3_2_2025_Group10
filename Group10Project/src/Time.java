package Group10Project.src;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Tổng số giây
    public int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    // Tính khoảng cách thời gian giữa 2 đối tượng Time
    public int differenceInSeconds(Time other) {
        return Math.abs(this.toSeconds() - other.toSeconds());
    }

    // Hiển thị thời gian
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
}
