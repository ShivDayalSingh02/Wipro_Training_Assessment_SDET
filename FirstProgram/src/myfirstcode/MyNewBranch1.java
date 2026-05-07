package myfirstcode;
import java.util.*;

public class MyNewBranch1 {
	public static void main(String[] args) {
		System.out.println("Hello guys, this is my new branch");
		System.out.println("Now, printing statement in loop :-");
		for(int i=0; i<10;i++) {
			System.out.println("Hello Shiv");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total Elements :-");
		int n =sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			System.out.println(i);
		}
	}
}