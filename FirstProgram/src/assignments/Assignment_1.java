//eligible for loan or not
package assignments;
import java.util.*;

public class Assignment_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :-");
		int age =sc.nextInt();
		System.out.println("Enter the Salary :-");
		int salary =sc.nextInt();
		if(age>=18 && salary>=25000) {
			System.out.println("The Person is Eligible for Loan.");
		}
		else {
			System.out.println("The Person is not Eligible for Loan.");
		}
		sc.close();
	}
}

//Eligible for voting or not
/*
package assignments;
import java.util.*;

public class Assignment_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year :- ");
		int year = sc.nextInt();
		if(year>=18) {
			System.out.println("The person is eligible for voting.");
		}
		else {
			System.out.println("The person is not eligible for voting, Hence underage.");
		}
		sc.close();
	}
}
*/

//Leap year or not
/*
package assignments;
import java.util.*;

public class Assignment_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year :- ");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("The year is Leap year.");
		}
		else {
			System.out.println("The year is not Leap year");
		}
		sc.close();
	}
}
*/

//Number is positive or Negative or Zero
/*
package assignments;
import java.util.*;

public class Assignment_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int n = sc.nextInt();
		if(n>0) {
			System.out.println("Entered Number is positive.");		
			}
		else if(n==0) {
			System.out.println("Entered Number is Zero.");
		}
		else {
			System.out.println("Entered Number is Negative.");
		}
		sc.close();
	}
}
*/