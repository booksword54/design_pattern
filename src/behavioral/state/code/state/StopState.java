package behavioral.state.code.state;

import behavioral.state.code.context.Context;
import behavioral.state.code.state.abstract_state.State;

public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
