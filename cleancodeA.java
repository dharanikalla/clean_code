package Cleancode;

public class CleanCode {
	public static double simple(double p,double t,double r) {
		return (p*t*r)/100;
	}
	
	public static double compound(double p,double t,double r){
		return p* Math.pow(1.0+r/100.0,t)-p;
		
	}

	public static void main(String[] args){
		
		
		System.out.println(Simple(1000,2,2));
		System.out.println(Compound(2000,4,2));
	}
	

}