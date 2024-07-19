package behavioral.observer.code.subject;

import behavioral.observer.code.observer.abstract_observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public int getState() {
        return this.state;
    }

}
