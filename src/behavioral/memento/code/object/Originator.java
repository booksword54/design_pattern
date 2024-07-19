package behavioral.memento.code.object;

import behavioral.memento.code.memento.Memento;

public class Originator {

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(this.state);
    }

    public void getStateFromMemento(Memento Memento) {
        this.state = Memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

}