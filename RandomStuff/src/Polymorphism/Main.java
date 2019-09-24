package Polymorphism;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		SomeSuper somesuper = new SomeSuper("i am private", "i am public");
		SomeChild somechild = new SomeChild("i am private in child", "i am public in child", "i am child");
		
		System.out.println(somesuper.publicString);
		somesuper.printPrivateString();
		
		System.out.println(somechild.publicString);
		somechild.printChildString();
		somechild.printPrivateString();
		
		ArrayList<SomeSuper> list = new ArrayList<>();
		list.add(somechild);
		list.add(somesuper);
		list.get(0).printPrivateString();
		list.get(1).printPrivateString();
	}
}
