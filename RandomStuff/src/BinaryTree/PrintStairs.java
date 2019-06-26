package BinaryTree;

public class PrintStairs {

	public static void main(String[] args) {
		printStars(20, 6);

	}

	private static void printStars(int rows, int columns) {
		int stars = 1;
		int currentAmmountOfBlocks = 1;
		for (int i = 0; i < rows; i++) {
			int spaces = (int) ((2*rows)-1-currentAmmountOfBlocks) / 2;
			for (int j = 0; j < columns; j++) {
				for (int s = 0; s < spaces; s++) {
					System.out.print(" ");
				}
				for (int c = 0; c < currentAmmountOfBlocks; c++) {
					System.out.print("*");
				}
				for (int s = 0; s <= spaces; s++) {
					System.out.print(" ");
				}
			}
			System.out.println();
			currentAmmountOfBlocks += 2;
		}
	}
}
