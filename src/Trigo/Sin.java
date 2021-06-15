package Trigo;
import Trigo.Factorial;

public class Sin extends Trignometry{
	private int numOfTerms=10;

	public void Sin() {
		
	}
	
	@Override
	public double calculate(double input, String s) {
		double angleInRadian=input;
		if(s.equals("DEGREE")) {
			angleInRadian=degreeToRadian(angleInRadian);
		}
		double sum=angleInRadian;
		for(int i=1;i<=numOfTerms;i++)
		{
			sum=sum+Math.pow(-1,i)*Math.pow(angleInRadian,2*i+1)/Factorial.calculate_fact(2*i+1);
		}
		
		
		return sum ;
	}

	
	
	
}
