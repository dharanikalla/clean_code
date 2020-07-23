package Cleancode;
import java.util.Scanner;
public class CleancodeB {
	public static void check(String str) {
		if(str.equals("standard materials")) {
			System.out.println(standard());
		}
		else if(str.equals("above standard materials")) {
			System.out.println(above_standard());
		}
		else if(str.equals("high standard material")) {
			System.out.println(high_standard());
		}
		else if(str.equals("high standard material and fully automated house")) {
			System.out.println(high_standard_fully_automated());
		}
	}
	public static int standard1() {
		return 1200;
	}
	public static int above_standard1() {
		return 1500;
	}
	public static int high_standard1() {
		return 1800;
	}
	public static int high_standard_fully_automated1() {
		return 2500;
	}
	
	public static void main(String[] args) {
		try{
			Scanner obj=new Scanner(System.in);
			String s=obj.nextLine();
			check(s);
		}
		finally{
		}
	
	}
}