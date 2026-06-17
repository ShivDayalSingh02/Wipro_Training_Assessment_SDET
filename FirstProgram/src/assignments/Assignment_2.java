/*
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double balance = 1000;

        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice:- ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance:- " + balance);

            } else if (choice == 2) {
                System.out.print("Enter deposit amount:- ");
                double amount = sc.nextDouble();
                balance += amount;
                System.out.println("Deposited successfully.");

            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount:- ");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else if (choice == 4) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
	}
}
*/

package assignments;
import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        int choice;
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount deposited.");
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Amount withdrawn.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}


/*
// Fibomacci Series
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int i = 1;

        System.out.println("Fibonacci Series:");

        while (i <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
        sc.close();
	}
}
*/

/*
// Prime number or not
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 2;

        while (i < num) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
            i++;
        }
        System.out.println("Prime number");
        sc.close();
	}
}
*/

// Print Armstrong number using while loop
/*
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
        sc.close();
	}
}
*/
 
// sum of all digits using while loop
/*
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;     
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
	}
}
*/

/*
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int count = 0; // doing by creating temporary variable

		if (num == 0) {
		    count = 1;
		} else {
		    while (num > 0) {
		        num = num / 10;
		        count++;
		    }
		}
		System.out.println("Number of digits: " + count);
		sc.close();
	}
}
*/

// Multiplication of Number
/*
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        System.out.println("Multiplication Table of " + num + ":");

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
        sc.close();  
	}
}
*/

/*
//Factorial Number
        package assignments;
        import java.util.Scanner;

        public class Assignment_2 {

        	public static void main(String[] args) {
        		  Scanner sc = new Scanner(System.in);

        	        System.out.print("Enter a number: ");
        	        int num = sc.nextInt();

        	        int i = 1;
        	        double factorial = 1;

        	        while (i <= num) {
        	            factorial = factorial * i;
        	            i++;
        	        }
        	        System.out.println("Factorial of entered number is: " + factorial);
        	        sc.close();
        	}
        }
*/
        
/*
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double amount, result;
        int choice;

        double INR_TO_USD = 0.010;
        double USD_TO_INR = 100.0;

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextDouble();

        if (choice == 1) {
            result = amount * INR_TO_USD;
            System.out.println("Converted amount: " + result);

        } else if (choice == 2) {
            result = amount * USD_TO_INR;
            System.out.println("Converted amount: " + result);

        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
	}
}
*/

/*
// Display food item name and price

package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	        System.out.print("Enter Food item number :- ");

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("You selected Burger. Price: ₹120");
	                break;
	            case 2:
	                System.out.println("You selected Pizza. Price: ₹250");
	                break;
	            case 3:
	                System.out.println("You selected Sandwich. Price: ₹80");
	                break;
	            case 4:
	                System.out.println("You selected Pasta. Price: ₹150");
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	        sc.close();
	}
}
*/


/*
// question number 10 pending
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int count = 0;

		        // Handle negative numbers
		        num = Math.abs(num);

		        // Special case for 0
		        if (num == 0) {
		            count = 1;
		        } else {
		            while (num > 0) {
		                num = num / 10;
		                count++;
		            }
		        }
		        System.out.println("Number of digits: " + count);
		        sc.close();
	}
}
*/

/*
// Grade Display and performance Display
package assignments;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your grade (A, B, C, D, F): ");
		        char grade = scanner.next().toUpperCase().charAt(0);

		        switch (grade) {
		            case 'A':
		                System.out.println("Excellent performance!");
		                break;
		            case 'B':
		                System.out.println("Good job!");
		                break;
		            case 'C':
		                System.out.println("Average performance.");
		                break;
		            case 'D':
		                System.out.println("Needs improvement.");
		                break;
		            case 'F':
		                System.out.println("Fail. Better luck next time.");
		                break;
		            default:
		                System.out.println("Invalid grade entered.");
		        }
		        scanner.close();
	}
}
*/

/*
// Vowel And Consonant using Switch case
package assignments;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :-");
		char ch =sc.next().charAt(0);
		ch = Character.toLowerCase(ch);
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("Entered Character is a Vowel.");
			break;
		default: if(ch>='a' && ch<='z') {
			System.out.println("Entered Character is a Consonant.");
		}
		else {
			System.out.println("Invalid Day");
		}
		}
	}
}
*/

/*
// Find a number is even or odd using switch case
package assignments;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int n =sc.nextInt();
		switch(n%2) {
		case 0 : System.out.println("The entered number is even.");
		break;
		case 1 : System.out.println("The entered number is odd.");
		break;
		default: System.out.println("Invalid Number");
		sc.close();
		}
	}
}
*/