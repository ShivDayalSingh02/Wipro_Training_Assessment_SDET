package ooppsConcepts;

class Hospital {
	

}
		
public class OopsConceptsPrograms {
	public static void main(String[] args) {
		Hospital obj = new Hospital();
	}
}










// Abstract Class inheritance
/*
package ooppsConcepts;

abstract class Hospital {
		void documents() {
			System.out.println(" ");
		}
		void patients() {
			System.out.println(" ");
		}
		abstract void ot();
		abstract void operations();
}
class Doctor extends Hospital{
		void ot() {
			System.out.println(" ");
		}
		void operations() {
			System.out.println(" ");
		}
		void documents() {
			System.out.println(" ");
		}
		void patients() {
			System.out.println(" ");
		}
	}
class Nurse extends Hospital{// why here have to use abstract
	void documents() {
		System.out.println(" ");
	}
	void patients() {
		System.out.println(" ");
	}
	 void ot() {
		 
	 }
	 void operations() {
		 
	 }
}	
public class OopsConceptsPrograms {
	public static void main(String[] args) {
		Doctor obj = new Doctor();
		obj.ot();
		obj.operations();
		obj.documents();
		obj.patients();
		Nurse obj1 = new Nurse();
		obj1.documents();
		obj1.patients();
	}
}
*/

/*
//Abstract classs Abstract keyword
package Poly_practice;
//Polymorphism- 1. compile time polymorphism -Method overloading-
//               1.same method name but different arguments
//               2. method overloading done in same class
//            2. Runtime polymorphism- Method overriding
//               same method name and same arguments
//               2. method overriding done in different class (Is - a- relationship(inheritance))

abstract class Vehicle
{
	abstract void nooftyres();
	
	void type()
	{
		System.out.println("Petrol/Diesel/electric");
	}
}
class Scooter extends Vehicle
{
	void nooftyres()
	{
		System.out.println("no of tyre for scooter=2");
	}
}
class Car extends Vehicle
{
	void nooftyres()
	{
		System.out.println("no of tyre for car=4");
	}
}
public class Vehicle_test {
	public static void main(String[] args) {
		Scooter sc=new Scooter();
		sc.nooftyres();
		sc.type();
		System.out.println("*********************");
		Car c=new Car();
		c.nooftyres();
		c.type();
		//Vehicle v=new Vehicle();
	}
}
*/

// This Keyword
/*
package Keywords_practice;
class Animal
{
	int x=100;
	String name,type;
	void eat(int x,String name, String type)
	{
         this.x=x;// refer current class variable
         this.name=name;
   		this.type=type;
		System.out.println("X=  "+x);
		System.out.println("name=  "+name);
		System.out.println("type "+type);
	}
	void details()
	{
		this.eat(100, "Max","Dog");// refer current class method
		Control_statements.BreakState.eat();// calling different class method
	}
	Animal()
	{
		//this(10);
		System.out.println("Default constructor");
	}
	Animal(int a)
	{
		this();
	}
}
public class Animal_test {
 
	public static void main(String[] args) {
		
		Animal a=new Animal(1);
		a.details();
	}
}
*/

//Static class and Static object of inner class
/*
package Keywords_practice;

public class Emp {
	static class Innerclass
	{
		void testt()
		{
			System.out.println("Inner class Method");
		}
		
	}
	int empid;
	String name;
	// static variable
	static String companyname="Wipro";
	void show(int empid1, String name1)
	{
		empid=empid1;
		name=name1;
	
		System.out.println("empid= "+empid);
		System.out.println("name= "+name);
		System.out.println("companyname= "+companyname);
	}
	//static method
	static void details(int empid1, String name1)
	{
	     String st;
		//System.out.println("empid= "+empid);
		//System.out.println("name= "+name);
		System.out.println("companyname= "+companyname);
	}
	//static block
	static
	{
		System.out.println("block");
	}
	
	{
		System.out.println("block");
	}
 
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.show(101, "Rohit");
		emp.show(102, "Soham");
		emp.show(103, "Mohan");
		//show(103, "Mohan");
		details(101, "Rohit");
		Emp.Innerclass test=new Innerclass();
		test.testt();
	}
}
*/

//inheritence
/*
package ooppsConcepts;

class Grandparent {
	void openland()
	{
		System.out.println("Openland for commercial use");
	}
}
class Parent1 extends Grandparent {
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("BAleno Petrol car");
	}
}
class Parent2 extends Grandparent {
	void flat()
	{
		System.out.println("5BHK");
	}
	void car()
	{
		System.out.println("Ford Endevour Disel car");
	}
}
class Childp1 extends Parent1 {
	void bike()
	{
		System.out.println("Pulsar");
	}
}
class Childp2 extends Parent2 {
	void bike()
	{
		System.out.println("Royal Enfield");
	}
}
public class OopsConceptsPrograms {
	public static void main(String[] args) {
		Childp1 mohan=new Childp1();
		mohan.flat();
		mohan.car();
		mohan.bike();
		mohan.openland();
		
		System.out.println("********************************");
		
		Childp2 rohan=new Childp2();
		rohan.flat();
		rohan.car();
		rohan.bike();
		rohan.openland();
	}
}
*/

// static block and simple block
/*
package Keywords_practice;

public class Emp {
	int empid;
	String name;
	// static variable
	static String companyname="Wipro";
	void show(int empid1, String name1)
	{
		empid=empid1;
		name=name1;
	
		System.out.println("empid= "+empid);
		System.out.println("name= "+name);
		System.out.println("companyname= "+companyname);
	}
	//static method
	static void details(int empid1, String name1)
	{
	     String st;
		//System.out.println("empid= "+empid);
		//System.out.println("name= "+name);
		System.out.println("companyname= "+companyname);
	}
	//static block
	static
	{
		System.out.println("block");
	}
	{
		System.out.println("block");
	}
 
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.show(101, "Rohit");
		emp.show(102, "Soham");
		emp.show(103, "Mohan");
		//show(103, "Mohan");
		details(101, "Rohit");
	}
}
*/

/*
class Grandparent
{
	void openland()
	{
		System.out.println("Openland for commercial use");
	}
}
class Parent1 extends Grandparent
{
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("BAleno Petrol car");
	}
}
class Parent2 extends Grandparent
{
	void flat()
	{
		System.out.println("2BHK");
	}
	void car()
	{
		System.out.println("BAleno Petrol car");
	}
}
class Childp1 extends Parent1
{
	void bike()
	{
		System.out.println("Pulsar");
	}
}
class Child1p2 extends Parent2
{
	void bike()
	{
		System.out.println("Pulsar");
	}
}
 
public class Single_test {
	
 
	public static void main(String[] args) {
		Childp1 mohan=new Childp1();
		mohan.flat();// self
		mohan.car();// parent
		mohan.bike();// parent
		mohan.openland();// grandparent
	}
}
// Single inheritance= parent-->Child
//Multilevel inheritance= GrandParent-->Parent--> Child-->SubChild.......
// Hierarchical inheritance=Parent-->Child1-->Subchild1
//                                         -->Subchild2
//                               -->Child2
//                                -->Child3
*/

/*
package ooppsConcepts;

class Hospital{
	void empid(int empid) {
		System.out.println("Emp ID is :- "+empid);
	}
	void empname(String name) {
		System.out.println("Emp Name is :- "+name);
	}
	void empshift(String empshift) {
		System.out.println("Emp Shift is :- "+empshift);
	}
}
class patient extends Hospital{
	void ptno(int srno) {
		System.out.println("Patient serial number is :- "+srno);
	}
	void ptname(int name) {
		System.out.println("Patient name is :- "+name);
	}
}

public class OopsConceptsPrograms {
	public static void main(String[] args) {
		patient obj = new patient();
		obj.empshift("Night Shift");
		}
	}
*/

/*
package Inheritance_practice;
class Animal// parent  class/ base class . / Super class
{
	void eat(String eat) {
		System.out.println("Eat ="+eat);
	}
	void sound(String sd)
	{
		System.out.println("Sound ="+sd);
	}
}
class Dog extends Animal// child class/ sub class/ extended class
{
	void color()
	{
		System.out.println("Black");
	}
}
class Cat extends Animal
{
	void walk()
	{
		System.out.println("Cat Walk");
	}
}
 
public class Single_in {
 
	public static void main(String[] args) {
		Dog d=new Dog();
		d.color();
		d.eat("Royal canin");
		d.sound("Barking");
		
		Cat c=new Cat();
		c.walk();
		c.eat("Fish");
		c.sound("Meow");
	}
}
*/

//method overloading
/*
package Object_class_method;

public class Student {
	
	void details(int rollno, String name)
	{
		System.out.println("Rollno ="+rollno);
		System.out.println("name ="+name);
	}
	void details(String name,int rollno )
	{
		System.out.println("name ="+name);
		System.out.println("Rollno ="+rollno);
		
	}
	void details(int rollno ,String name, int age)
	{
		System.out.println("Rollno ="+rollno);
		System.out.println("name ="+name);
		System.out.println("Age ="+age);
	}
 
	public static void main(String[] args) {
		Student stud=new Student();
		stud.details(101, "Nisha", 20);
	}
}
*/
