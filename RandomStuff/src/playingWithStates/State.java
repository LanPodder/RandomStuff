package playingWithStates;

public interface State {
	public void exec(StateController sc);
	public boolean isExecuting();
}
