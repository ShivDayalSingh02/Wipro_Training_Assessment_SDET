package myfirstcode;
import java.util.*;

public class ControlStatements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :-");
		char ch =sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("This is Vowel");
		}
		else {
			System.out.println("This is consonant");
		}
		sc.close();
	}
}

/*
String day = "Sunday";
if(day=="Monday" || day=="Tuesday" || day=="Wednesday" || day=="Thursday" || day=="Friday" || day=="Saturday") {
	System.out.println(day+" is a Working Day.");
}
else {
	System.out.println(day+" is a Sleeping Day.");
}
*/