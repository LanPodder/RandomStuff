package playingWithStates;

public class MidState implements State{

	@Override
	public void exec(StateController sc) {
		System.out.println("ending midstate, starting endstate");
		sc.updateState(new EndState());
	}

	@Override
	public boolean isExecuting() {
		return true;
	}

}
