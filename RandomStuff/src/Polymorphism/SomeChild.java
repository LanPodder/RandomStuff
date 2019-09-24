package Polymorphism;

public class SomeChild extends SomeSuper{

	private String childString;
	public SomeChild(String privateString, String publicString, String childString) {
		super(privateString, publicString);
		this.childString = childString;
	}

	public void printChildString() {
		System.out.println(childString);
	}
}
