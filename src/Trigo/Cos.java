package Trigo;
public class Cos extends Trignometry {

	public Cos() {}

	private int numOfTerms=12;
	
	@Override
	public double calculate(double input, String s) {
		double angleInRadian=input;
		if(s.equals("DEGREE")) {
			angleInRadian=degreeToRadian(angleInRadian);
			
		}
		double sum=0;
		
		for(int i=1,j=0;i<=numOfTerms;i++,j=j+2)
		{
			
			if(numOfTerms==1) {
				sum=1;	
			}

			else 
			{
				sum=sum+Math.pow(-1,i-1)*(Math.pow(angleInRadian,j)/Factorial.calculate_fact(j));
			}	
		
		}
		
		
		return sum ;
	}
}
