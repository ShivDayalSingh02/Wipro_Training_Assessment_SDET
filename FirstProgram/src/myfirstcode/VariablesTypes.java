package myfirstcode;

public class VariablesTypes {
	
	static String CompanyName = "WIPRO"; // static variable
	int age; //global variable
	
	// local variable down here in method
	void FirstEmp(String name, int EmpID) {
		age = 21;
		System.out.println("Employee Company Name :- "+CompanyName); // static variable value
		System.out.println("Employee Name :- "+name); // local variable value
		System.out.println("Employee ID :- "+EmpID); // local variable value
		System.out.println("Employee Age :- "+age); //global variable value
	}
	void SecondEmp(String name, int EmpID) {
		age = 24;
		System.out.println("Employee Company Name :- "+CompanyName);
		System.out.println("Employee Name :- "+name);
		System.out.println("Employee ID :- "+EmpID);
		System.out.println("Employee Age :- "+age);
	}
	public static void main(String[] args) {
		VariablesTypes vt = new VariablesTypes();
		vt.FirstEmp("Shiv",1);
		vt.SecondEmp("Shivam", 2);
	}
}
