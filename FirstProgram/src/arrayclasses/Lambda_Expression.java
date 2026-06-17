package arrayclasses;

interface Calculator {
    int num(int a, int b);
}
public class Lambda_Expression {
	public static void main(String[] args) {

		Calculator add = (a, b) -> a + b;
		Calculator sub = (a, b) -> a - b;
		Calculator mul = (a, b) -> a * b;
		Calculator div = (a, b) -> a / b;
		int a = 20, b = 10;
		System.out.println("Addition: " + add.num(a, b));
		System.out.println("Subtraction: " + sub.num(a, b));
		System.out.println("Multiplication: " + mul.num(a, b));
        System.out.println("Division: " + div.num(a, b));
    }
}







/*
// Lambda expression and Array as list
List<String> list = Arrays.asList("Hello", "Welcome", "Learners");
list.forEach(item -> System.out.println(item));
*/