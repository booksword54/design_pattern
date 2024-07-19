package behavioral.state.code.context;

import behavioral.state.code.state.abstract_state.State;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}