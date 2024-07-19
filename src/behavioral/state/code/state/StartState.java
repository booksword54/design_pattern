package behavioral.state.code.state;

import behavioral.state.code.context.Context;
import behavioral.state.code.state.abstract_state.State;

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}