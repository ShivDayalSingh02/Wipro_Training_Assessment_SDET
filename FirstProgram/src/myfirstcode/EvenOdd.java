package myfirstcode;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		double i =sc.nextInt();
		if(i%2==0) {
			System.out.println("The entered number is even.");
		}
		else {
			System.out.println("The entered number is odd");
		}
		sc.close();
	}
}
