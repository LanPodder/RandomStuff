package InterfaceStuff;

public class Main {
	
	public static void main(String args[]) {
		ClientImplementor impl = new ClientImplementor();
		AClient aclient = new ClientImplementor();
		BClient bclient = new ClientImplementor();
		
		ClientDependend d = new ClientDependend(aclient);
		
		d.execute();
	}
}
