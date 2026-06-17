package myfirstcode;

import java.util.Scanner;

public class DivisibilityBy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int n =sc.nextInt();
		if(n%3==0 || n%7==0) {
			System.out.println(n+" is divisible by 3 or 7.");
		}
		else {
			System.out.println(n+" is not divisible by 3 or 7.");
		}
		sc.close();
	}
}

/*
package myfirstcode;

import java.util.Scanner;

public class DivisibilityBy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int i =sc.nextInt();
		if(i%5==0 && i%11==0) {
			System.out.println(i+" is divisible by 5 and 11.");
		}
		else {
			System.out.println(i+" is not divisible by 5 and 11.");
		}
		sc.close();
	}
}
*/
