import java.util.Set;

public class ClockTimer extends Subject{
    private int seconds;
    private int minutes;
    private int hour;

    public ClockTimer(Set<Observer> observers) {
        super(observers);
    }
    public ClockTimer() {
        super();
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getHours() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    void tick(){
        notifies();
    }
}
