package playingWithStates;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		StateController control = new StateController();
		
		while(control.isExec()) {
			control.exec();
		}
		BigInteger b = new BigInteger("1");
		System.out.println(b.doubleValue());
	}
}
