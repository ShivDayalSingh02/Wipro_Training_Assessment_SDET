package arrayclasses;

import java.util.*;

public class Linked_List {

	public static void main(String[] args) {
		List <String> list = new LinkedList<String>();
		LinkedList<String> list1 = new LinkedList <String>();
		
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add("grapes");
		list.add("kiwi");
		
		System.out.println(list.size());
		System.out.println(list.reversed());
		list.clear();
		System.out.println(list);
	}
}


/*

package Collections_practice;

import java.util.ArrayList;// only arraylist
 
import java.util.*;
// follows insertion order
// index based
// Multiple null allowed
// duplicate allowed
 
public class List_test {
 
	public static void main(String[] args) {
		int[] arr= {9,8};//fixed size//
		List<Integer> list=new LinkedList<Integer>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(5);
		list1.add(4);
		list.add(9);
		list.add(0);
		list.add(8);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(8);
	//	list.add(80);
	System.out.println(list);//
	ListIterator<Integer> it=list.listIterator();
	Iterator<Integer> itr=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
//		
 
	}
 
}
// parent= class, child=class--> extends
//parent=interface, child=interface--> extends
// parent=interface, child=class--> implements
//parent =class ,child=interface

*/
