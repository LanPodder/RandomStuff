package playingWithStates;

public class EndState implements State{

	@Override
	public void exec(StateController sc) {
		System.out.println("sitting in end state");
	}

	@Override
	public boolean isExecuting() {
		return false;
	}

}
