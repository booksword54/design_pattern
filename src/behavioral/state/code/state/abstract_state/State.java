package behavioral.state.code.state.abstract_state;

import behavioral.state.code.context.Context;

public interface State {
    void doAction(Context context);
}