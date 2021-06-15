package Trigo;

public class Main {
	public static void main(String args[]) {
	Trignometry sin=new Sin();
	Trignometry cos=new Cos();
	Trignometry tan=new Tan();
	System.out.println(sin.calculate(77,"DEGREE"));
	System.out.println(cos.calculate(77,"DEGREE"));
	System.out.println(tan.calculate(77,"DEGREE"));

	}

}
