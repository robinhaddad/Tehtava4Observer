import java.util.HashSet;
import java.util.Set;

public abstract class Subject {

    Set<Observer> observers = new HashSet();
    public Subject(Set<Observer> observers) {
        this.observers = observers;
    }
    public Subject() {}

    public void attach(Observer o){
        observers.add(o);
    }
    public void detach(Observer o){
        observers.remove(o);
    }

    protected void notifies(){
        for(Observer o : observers){
            o.update(this);
        }
    }
}
