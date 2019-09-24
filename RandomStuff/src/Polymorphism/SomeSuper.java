package Polymorphism;

public class SomeSuper {
	private String privateString;
	public String publicString;
	public SomeSuper(String privateString, String publicString) {
		this.privateString = privateString;
		this.publicString = publicString;
	}
	
	public void printPrivateString() {
		System.out.println(privateString);
	}
}
