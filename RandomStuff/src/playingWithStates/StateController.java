package playingWithStates;

public class StateController {
	private State state;
	public StateController() {
		state = new StartState();
	}
	
	public void exec() {
		state.exec(this);
	}
	
	public boolean isExec() {
		return state.isExecuting();
	}
	
	public void updateState(State state) {
		this.state = state;
	}
}
