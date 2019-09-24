package InterfaceStuff;

public class ClientImplementor implements AClient, BClient{

	@Override
	public void doSomethingElse() {
		System.out.println("do sth else");
	}

	@Override
	public void doSomething() {
		System.out.println("do sth");
	}
	
}
