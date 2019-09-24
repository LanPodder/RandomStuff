package InterfaceStuff;

public class ClientDependend {
	AClient client;

	public ClientDependend(AClient client) {
		this.client = client;
	}
	
	public void execute() {
		client.doSomething();
	}
}
