package myfirstcode;

public class Conditional {

	public static void main(String[] args) {
		int per = 81;
		if(per>=75 && per<=100) {
			System.out.println("Dict");
		}
		else if(per>=60 && per<75) {
			System.out.println("First Class");
		}
		else if(per>=50 && per<60) {
			System.out.println("Second Class");
		}
		else if(per>=40 && per<50) {
			System.out.println("Third Class");
		}
		else if(per>=34 && per<40) {
			System.out.println("Pass");
		}
		else if(per>=0 && per<34) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
