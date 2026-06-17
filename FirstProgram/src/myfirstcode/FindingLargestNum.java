package myfirstcode;

import java.util.Scanner;

public class FindingLargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number :-");
		int i =sc.nextInt();
		System.out.println("Enter the Second Number :-");
		int j =sc.nextInt();
		if(i>j) {
			System.out.println(i+" is the largest number amongst two numbers.");
		}
		else {
			System.out.println(j+" is the largest number amongst two numbers.");
		}
		sc.close();
	}
}


/*
package myfirstcode;

import java.util.Scanner;

public class FindingLargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number :-");
		int i =sc.nextInt();
		System.out.println("Enter the Second Number :-");
		int j =sc.nextInt();
		System.out.println("Enter the Third Number :-");
		int k =sc.nextInt();
		if(i>j && i>k) {
			System.out.println(i+" is the largest number amongst all three numbers.");
		}
		else if(j>k && j>i) {
			System.out.println(j+" is the largest number amongst all three numbers.");
		}
		else {
			System.out.println(k+" is the largest number amongst all three numbers.");
		}
		sc.close();
	}
}
*/
