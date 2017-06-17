package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class MyHashTableKeys {
	public static void main(String args[]){
		Hashtable<String, String> ht=new Hashtable<String, String>();
		ht.put("first", "mayur");
		ht.put("two", "arpit");
		ht.put("threee", "payal");
		Enumeration e=ht.keys();
				for(String key: keys)
					System.out.println(key);
	}


}