package behavioral.observer.code.observer.abstract_observer;

import behavioral.observer.code.subject.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
