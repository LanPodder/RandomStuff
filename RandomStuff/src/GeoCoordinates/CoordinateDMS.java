package GeoCoordinates;

public class CoordinateDMS {
	private int degree, minute;
	private double second;
	private boolean inverted;
	
	public CoordinateDMS(int degree, int minute, double second) {
		this.degree = degree;
		this.minute = minute;
		this.second = second;
		this.inverted = false;
	}
	
	public CoordinateDMS(int degree, int minute, double second, boolean inverted) {
		this.degree = degree;
		this.minute = minute;
		this.second = second;
		this.inverted = inverted;
	}
	
	@Override
	public String toString() {
		return degree+"°"+minute+"'"+second+"''";
	}
	
	public void add(CoordinateDMS coord) {
		int t = 0;
		second += coord.second;
		t = (int)Math.floor(second/60);
		if(t > 0) {
			second -= 60*t;
		}
		
		minute += coord.minute + t;
		t = (int)Math.floor(minute/60);
		if(t > 0) {
			minute -= 60*t;
		}
		
		degree += coord.degree + t;
	}
	
	public void subtract(CoordinateDMS coord) { //complicated
		int t = 0;
		second -= coord.second;
		if(second < 0) {
			second += 60;
			t=1;
		}
		
		minute -= coord.minute + t;
		t = 0;
		if(minute < 0) {
			minute += 60;
			t=1;
		}
		
		degree -= coord.degree;
	}

	private int minuteSecondCalc(double minsec) {
		int t;
		t = (int)Math.floor(minsec/60);
		if(t > 0) {
			minsec -= 60*t;
		}
		return t;
	}
}
