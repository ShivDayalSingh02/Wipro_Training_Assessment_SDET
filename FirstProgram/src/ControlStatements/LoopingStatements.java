package ControlStatements;

import java.util.Scanner;

public class LoopingStatements {

	public static void main(String[] args) {
		
		//While Loop for Sum of N natural numbers
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int n = sc.nextInt();
		int sum = 0; //temporary variable
		int i = 1; //initial variable
		while(i <= n) {
			sum = sum+i;
			i++;
		}
		System.out.println("The Sum of First "+n+" Natural Numbers is :- "+sum);
		sc.close();
		*/
		
		//While Loop for factorial
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int n = sc.nextInt();
		int fact = 1; //temporary variable
		int i = 1; //initial variable
		while(i <= n) {
			fact = fact*i;
			i++;
		}
		System.out.println("The Factorial of "+n+" is :- "+fact);
		sc.close();
	}
}
