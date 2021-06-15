package Trigo;
import Trigo.*; 

public class Tan extends Trignometry{
	
	
	

	@Override
	public double calculate(double input, String s) {
		double angleInRadian=input;
		
		Trignometry sin=new Sin();
		Trignometry cos=new Cos();
		 double numerator=sin.calculate(input,s);
		double denominator=cos.calculate(input,s);
		return (numerator/denominator);
	}

}
