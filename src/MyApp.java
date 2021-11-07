public class MyApp implements Runnable {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();

        AnalogClock analogClock = new AnalogClock(timer, "Analog Clock");
        DigitalClock digitalClock = new DigitalClock(timer, "Digital clock");

        analogClock.update(timer);
        digitalClock.update(timer);
        timer.setHour(6);
        timer.setMinutes(12);
        timer.setSeconds(30);
        analogClock.update(timer);
        digitalClock.update(timer);

    }
    @Override
    public void run() {}
}
