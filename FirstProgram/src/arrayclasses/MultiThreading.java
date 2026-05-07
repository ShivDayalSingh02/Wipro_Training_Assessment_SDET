package arrayclasses;
 
public class MultiThreading extends Thread {
	
	public void run()
	{
		for(int i=0;i<2;i++)
		System.out.println(Thread.currentThread().getName());
	}
 
	public static void main(String[] args) throws InterruptedException {
				
		MultiThreading t0=new MultiThreading();// new state
		t0.start();
		t0.sleep(6000);
		MultiThreading t1=new MultiThreading();
		t1.start();
		System.out.println("current Priority for t1="+t1.getPriority());
		t1.setPriority(7);
		System.out.println("after set Priority for t1="+t1.getPriority());
		MultiThreading t2=new MultiThreading();
		t2.start();
		System.out.println("T2 name="+t2.getName());
		t2.setName("Max");
		System.out.println("T2 name="+t2.getName());
	}
}



























/*
// Using Lambda Expression is Exception Handling
package arrayclasses;
import java.util.Scanner;

public class MultiThreading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Runnable[] tasks = {

            // Addition
            () -> {
                System.out.print("Enter two numbers for Addition: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Addition = " + (a + b));
            },

            // Division (may throw exception)
            () -> {
                System.out.print("Enter two numbers for Division: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Division = " + (a / b)); // risky
            },

            // Multiplication
            () -> {
                System.out.print("Enter two numbers for Multiplication: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Multiplication = " + (a * b));
            },

            // Subtraction
            () -> {
                System.out.print("Enter two numbers for Subtraction: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Subtraction = " + (a - b));
            }
        };

        // Execute all tasks safely
        for (int i = 0; i < tasks.length; i++) {
            try {
                tasks[i].run();
            } catch (Exception e) {
                System.out.println("Error in operation " + (i + 1) + ": " + e);
                sc.nextLine(); // clear invalid input
            }
        }
        System.out.println("All operations attempted successfully.");
        sc.close();
    }
}
*/