public class DigitalClock implements Observer{

    private ClockTimer timer;
    private String name;
    private String getName() {
        return name;
    }

    public DigitalClock(ClockTimer timer, String name) {
        this.timer = timer;
        timer.attach(this);
        this.name = name;
    }
    @Override
    public void update(Subject theChangedSubject) {
        if(theChangedSubject==timer){draw();
        }
    }

    private void draw(){
        this.name = getName();
        int seconds = timer.getSeconds();
        int minutes = timer.getMinutes();
        int hours = timer.getHours();
        System.out.println(name + " time is:" + hours +":" + minutes + ":" + seconds);
    }
}
