package ooppsConcepts;

import java.util.*;

public class Exception_Handling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to divide by:-");
		int a=sc.nextInt();
		int b=88;
		try {
		int c=b/a;
		System.out.println("Division ="+ c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End");
	}

}

/*
package Exception_handling;

import java.util.Scanner;
 
public class Exception_test {
	// throw =is used to create an exception
	// throws = is used to declare exception
	//try -catch = is used to handle an exception
 
	public static void main(String[] args) throws InterruptedException   {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter divident");//120
		int a=sc.nextInt();
		System.out.println("Enter divisor");//120
		int b=sc.nextInt();
	    Thread.sleep(100);
		try
		{
			int c=a/b;//10/0
			System.out.println("Division is="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("pass the level");
		}
System.out.println("End");
	}
 
}
*/

// finally block use
/*
 * package Exception_handling;
 
import java.util.Scanner;
 
public class Exception_test {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter divident");//120
		int a=sc.nextInt();
		System.out.println("Enter divisor");//120
		int b=sc.nextInt();
		
		try
		{
			int c=a/b;//10/0
			System.out.println("Division is="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("pass the level");
		}
System.out.println("End");
	}
}
 */

//try catch and exception handling
/*
package Exception_handling;

import java.util.Scanner;
 
public class Test {
 
	public static void main(String[] args) {
//		String str="Hello";
//		System.out.println(1);
//		System.out.println(1);
//		System.out.println(1);
//		//System.out.println(1/0);
//		try {
//			System.out.println(1/0);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		System.out.println(1);
//		System.out.println(1);
//		System.out.println(1);
//		//System.out.println(2/0);// infinity
//		//File file="C:\\Users\\dell\\Desktop\\SDET April B3 -";//
//		Test t=new Test();// declaration and initialization of an object
//		Test t1;// declaration
//		t1=new Test();// initialization of an object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");//120
		int a=sc.nextInt();
		int b=88;
		try {
		int c=b/a;
		System.out.println("Division ="+ c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End");
	}
}
*/