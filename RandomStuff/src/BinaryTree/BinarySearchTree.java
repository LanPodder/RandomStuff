package BinaryTree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		t.add(3);
		t.add(1);
		t.add(2);
		t.add(-1);
		t.add(-2);
		t.add(-3);
		t.add(23);
		System.out.println(t.getHeight());
		System.out.println(t.toString());
	}
	
	public void add(T element) {
		if(root == null) {
			root = new BinaryNode<T>(element);
			root.element = element;
			return;
		}
		addSpot(root, element);
	}
	
	private void addSpot(BinaryNode<T> r, T element) {
		
		if(element.compareTo((T) r.element) < 0) {
			if(r.left == null) {
				r.left = new BinaryNode<T>(element);
				return;
			}
			addSpot(r.left, element);
		}
		
		if(element.compareTo((T) r.element) > 0) {
			if(r.right == null) { //if there is no right, insert there
				r.right = new BinaryNode<T>(element);
				return;
			}
			addSpot(r.right, element); //otherwise proceed to the right
		}
		//if current spot is equal to our element, do nothing
		return;
	}
	
	public int getHeight() {
		return heightCalc(root);
	}
	
	private int heightCalc(BinaryNode<T> r) {
		if(r == null) {
			return 0;
		}
		return 1 + Math.max(heightCalc(r.left), heightCalc(r.right));
	}
	
	public String toString() {
		return toStringCalc(root);
	}
	
	private String toStringCalc(BinaryNode<T> r) {
		if(r == null) {
			return "";
		}
		String res = "";
		String space = "";
		for(int i = 0; i < heightCalc(r)-1; i++) {
			space += "\t";
		}
		
		return space + "\t" + r.element.toString() + "\n" + toStringCalc(r.left) + space + toStringCalc(r.right);
	}
}
