package Encapsulation_practice;

public class Student {
	
	private int rollNo;
	String name;
	protected String course;
	public String college;
	
	public void setRollNo(int r) {
        rollNo = r;
    }

    public void setName(String n) {
        name = n;
    }

    public void setCourse(String c) {
        course = c;
    }

    public void setCollege(String col) {
        college = col;
    }
    //private variable return
    public int getRollNo() {
        return rollNo;
    }

	public static void main(String[] args) {
		

	}

}

/*
class Student {

    // Private - accessible only within this class
    private int rollNo;

    // Default - accessible within same package
    String name;

    // Protected - accessible within package + subclass
    protected String course;

    // Public - accessible everywhere
    public String college;

    // Setter methods (to assign values)
    public void setRollNo(int r) {
        rollNo = r;
    }

    public void setName(String n) {
        name = n;
    }

    public void setCourse(String c) {
        course = c;
    }

    public void setCollege(String col) {
        college = col;
    }

    // Getter method for private variable
    public int getRollNo() {
        return rollNo;
    }

    // Method to display data
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("College: " + college);
    }
}
*/
/*
public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s = new Student();

        // Accessing via setter methods (Encapsulation)
        s.setRollNo(101);
        s.setName("Rahul");
        s.setCourse("B.Tech");
        s.setCollege("ABC College");

        // Displaying values
        s.display();

        // Accessing private variable via getter
        System.out.println("Accessing Roll No using getter: " + s.getRollNo());
    }
}
*/
/*
package Encapsulation_practice;
class BankAccount {
        private double balance;// 1000
// transfer amt
       public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;// 1000+1000=2000
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
 
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;// 2000-1000=1000
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
 
    public double getBalance() {
      return balance;// retrieve current balance
    }
}
 
public class Bankdetails {
    public static void main(String[] args) {
    	BankAccount acc = new BankAccount();
 
        acc.deposit(1000);
        acc.withdraw(2000);
     System.out.println("Balance= "+acc.getBalance());
     Student st=new Student();
     System.out.println(st.rollno);// public
     System.out.println(st.name);// private name
//     try {
//     Encapsulation_practice.Student.st.rollno;// 1010
//     }catch(Exception e)
//     {
//    	 System.out.println(e);
//     }
    }
}
 
 //New Class 
package Encapsulation_practice;
 
public class Student {
	protected String name;
	public int rollno=101;
	String getname(String name)
	{
		return name;
	}
//	Student(String name)
//	{
//		this.name=name;
//	}
	
 
	public static void main(String[] args) {
		Student st=new Student();
		BankAccount ba=new BankAccount();
 
	}
 
}
*/
 