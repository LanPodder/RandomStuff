package BinaryTree;

public class BinaryTree <T>{
	public static void main(String[] args) {
		BinaryTree<Integer> t = new BinaryTree<>();
		BinaryNode<Integer> w = new BinaryNode<>(1);
		w.left = new BinaryNode<Integer>(12);
		w.right = new BinaryNode<Integer>(2);
		w.left.left = new BinaryNode<Integer>(5);
		w.left.left.right = new BinaryNode<Integer>(55);
		w.left.right = new BinaryNode<Integer>(56);
		w.right.left = new BinaryNode<Integer>(0);
		w.right.right = new BinaryNode<Integer>(7);
		t.root = w;
		System.out.println(t.searchT(0));
		System.out.println(t.searchT(0).element);
	}
	BinaryNode<T> root;

	public BinaryNode<T> searchT(T find) {
		return search(root, find);
	}
	
	private BinaryNode<T> search(BinaryNode<T> r, T find) {
		if(r == null) {
			return null; //falls die aktuelle wurzel null ist, return null
		}
		//System.out.println(r.element);
		//falls das gesuchte element in der aktuellen wurzel ist
		if(r.element.equals(find)) {
			return r;
		}
		
		BinaryNode<T> leftTree = search(r.left, find); //suche auf linker teilbaum
		BinaryNode<T> rightTree = search(r.right, find); //suche auf rechten teilbauem
		if(leftTree == null) {
			if(rightTree == null) {
				return null; //falls in beiden teilbaumen nix gefunden wird
			}
			return rightTree; //falls das element im rechten teilbaum ist
		}
		return leftTree; //falls das element im linken Teilbaum ist
	}
}
