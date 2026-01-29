public class time {
    private int hour;
    private int minute;
    private int second;


    public time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }


    public void setTime(int hour, int minute, int second) {
        this.hour = (hour >= 0 && hour < 24) ? hour : 0;
        this.minute = (minute >= 0 && minute < 60) ? minute : 0;
        this.second = (second >= 0 && second < 60) ? second : 0;
    }


    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }


    public String toStandard() {
        int standardHour;
        String period;


        if (hour == 0 || hour == 12) {
            standardHour = 12;
        } else {
            standardHour = hour % 12;
        }


        if (hour < 12) {
            period = "AM";
        } else {
            period = "PM";
        }

        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(time t) {
        this.second += t.second;
        if (this.second >= 60) {
            this.second -= 60;
            this.minute++;
        }

        this.minute += t.minute;
        if (this.minute >= 60) {
            this.minute -= 60;
            this.hour++;
        }

        this.hour = (this.hour + t.hour) % 24;
    }


    public static void main(String[] args) {
        time t = new time(23, 23, 23);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        time t2 = new time(4, 24, 33);
        t.add(t2);
        System.out.println("After add: " + t.toUniversal());
    }
}