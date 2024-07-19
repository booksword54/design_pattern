package behavioral.observer.code;

import behavioral.observer.code.observer.BinaryObserver;
import behavioral.observer.code.observer.HexaObserver;
import behavioral.observer.code.observer.OctalObserver;
import behavioral.observer.code.subject.Subject;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
