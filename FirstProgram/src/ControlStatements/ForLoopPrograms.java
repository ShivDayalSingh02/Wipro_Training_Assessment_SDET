package ControlStatements;

import java.util.Scanner;

public class ForLoopPrograms {

	public static void main(String[] args) {
		/*
		for(int i ='A';i<='Z';i++) {
			System.out.println(i);
		}
		*/
		/*
		int row = 5;
		for(int i = 1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		int row =5;
		for(int i = 1; i<=row ; i++) {
			//for spaces
			for(int j =1; j<=row-i;j++) {
				System.out.print(" ");
			}
			//for stars
			for(int j =1; j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
