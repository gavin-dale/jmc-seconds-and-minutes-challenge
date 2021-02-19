public class Main {
    public static void main(String[] args) {
        getDurationString(65, 66666);
        getDurationString(3945);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            minutes = seconds / 60 + minutes % 60;
            System.out.println(hours + "h" + minutes + "m" + seconds + "s");
            return hours + "h" + minutes + "m" + seconds + "s";
        } else {
            return "Invalid arguments";
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds - minutes * 60;
            getDurationString(minutes, seconds);
        } else {
            System.out.println("Invalid argument");
        }
    }
}
