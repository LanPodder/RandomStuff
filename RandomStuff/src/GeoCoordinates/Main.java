package GeoCoordinates;

public class Main {
	public static void main(String[] args) {
		CoordinateDMS a = new CoordinateDMS(0, 0, 0);
		CoordinateDMS b = new CoordinateDMS(0, 0, 10);
		a.subtract(b);
		System.out.println(a.toString());
	}
}
