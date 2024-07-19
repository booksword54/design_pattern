package behavioral.state.code;

import behavioral.state.code.context.Context;
import behavioral.state.code.state.StartState;
import behavioral.state.code.state.StopState;

public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);
      System.out.println(context.getState());

      StopState stopState = new StopState();
      stopState.doAction(context);
      System.out.println(context.getState());
   }
}