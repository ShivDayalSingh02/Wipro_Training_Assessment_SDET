package ControlStatements;

public class SwitchCase {

	public static void main(String[] args) {
		int day = 1;
		switch(day) {
		case 1 : System.out.println("Monday");
		break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		default: System.out.println("Invalid Day");
		}
	}
}



/*
int size = 30;
switch(size) {
case 26 : System.out.println("Extra Small(XS)");
break;
case 28 : System.out.println("Small(S)");
break;
case 30 : System.out.println("Medium(M)");
break;
case 32 : System.out.println("Large(L)");
break;
case 34 : System.out.println("Extra Large(XL)");
break;
default: System.out.println("Invalid Size");
*/
