package arrayclasses;

public class Hash_Map {

	public static void main(String[] args) {
		
		
	}

}

/*
// HashMap
package Collections_practice;
//elements store on the basis of Key
//does not follow insertion order
//single null allowed
//duplicate not allowed

import java.util.*;

public class HAsh_map {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("Ten", 10);
		map.put("Nine", 9);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Three", 8);
		map.put("Other", 10);
		map.put(null,null);
		map.put(null, 3);
		System.out.println(map);
		System.out.println(map.containsKey("nine"));
		System.out.println(map.containsValue(9));
		map.replace("Other", 10, 11);
		map.replace("Nine",90);
		System.out.println(map);
		System.out.println(map.get("Nine"));
		System.out.println();
	}
}
*/

// Linked Hash Map
/*
package Collections_practice;
import java.util.*;

//elements store on the basis of Key
//follow insertion order
//single null allowed
//duplicate not allowed
 
public class LinkedHAsh_map {
 
	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		map.put("One", 1);
		map.put("Ten", 10);
		map.put("Nine", 9);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Three", 8);
		map.put("Other", 10);
		map.put(null,null);
		map.put(null, 3);
		System.out.println(map);
		System.out.println(map.containsKey("nine"));
		System.out.println(map.containsValue(9));
		map.replace("Other", 10, 11);
		map.replace("Nine",90);
		System.out.println(map);
		System.out.println(map.get("Nine"));
		System.out.println();
	}
}
*/


/*
// Tree Map
package Collections_practice;
 
import java.util.LinkedHashMap;
import java.util.*;
 
//elements store on the basis of Key
//follow ascending  order
//does not allowed null
//duplicate not allowed
public class Tree_map {
 
	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("One", 1);
		map.put("Ten", 10);
		map.put("Nine", 9);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Three", 8);
		map.put("Other", 10);
		map.put(null,null);
		map.put(null, 3);
		System.out.println(map);
		System.out.println(map.containsKey("nine"));
		System.out.println(map.containsValue(9));
		map.replace("Other", 10, 11);
		map.replace("Nine",90);
		System.out.println(map);
	} 
}
*/
