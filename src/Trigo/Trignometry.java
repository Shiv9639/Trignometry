package Trigo;

public abstract class Trignometry {
	private static double PI;
	public static double getPI() {
		return PI;
	}
	public static void setPI(double pI) {
		PI = pI;
	}
	
	public Trignometry() {
		this.setPI(3.141592653589793238);
	}
	public abstract double calculate(double input,String s) ;
	
	
	public static double radianToDegree(double radian) {
		double degree = radian * 180 / PI;
		return degree;
		
	}
	
	public static double degreeToRadian(double degree) {
		double radian = degree * PI / 180;
		return radian;
		
	}
}

