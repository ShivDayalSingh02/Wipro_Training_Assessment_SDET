package assignments;

interface Division {
    void divide(int a, int b);
}
class Calculator implements Division {

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
public class Assignment_5 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.divide(10, 2);  
        obj.divide(10, 0);  
    }
}


/*
package assignments;

abstract class Bank {
	abstract double getInterestRate();
}
class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}
class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}
class ICICI extends Bank {
    double getInterestRate() {
        return 6.8;
    }
}
public class Assignment_5 {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}
*/

/*
package assignments;

public class Assignment_5 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
	public static void main(String[] args) {
		Assignment_5 calc = new Assignment_5();

        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
	}
}
*/