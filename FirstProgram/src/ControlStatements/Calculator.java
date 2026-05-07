package ControlStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :-");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number :-");
		int b = sc.nextInt();
		System.out.println("Enter the Correct Operator :-");
	    char Operator = sc.next().charAt(0);
		switch(Operator) {
		case '+' : System.out.println("Addition of two Numbers are :- "+(a+b));
		break;
		case '-' : System.out.println("Substraction of two Numbers are :- "+(a-b));
		break;
		case '*' : System.out.println("Multiplication of two Numbers are :- "+(a*b));
		break;
		case '/' : System.out.println("Division of two Numbers are :- "+(a/b));
		break;
		}
		sc.close();
	}
}
