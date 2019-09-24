package playingWithStates;

public class StartState implements State{

	@Override
	public void exec(StateController sc) {
		System.out.println("ending start state, starting midstate");
		sc.updateState(new MidState());
	}

	@Override
	public boolean isExecuting() {
		return true;
	}
	
}
