package Trigo;

public class Factorial {
	
	
	public static double calculate_fact(double d) {
		double fact=1;
		if(d<=1) {return 1;}
		else {
		for(int i=1;i<=d;i++) {
			fact=fact*i;
		}
		
		return fact;
		}
	}

}
