package sef.module9.activity;

import java.util.HashSet;
import java.util.Iterator;
//Needs to be completed
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		Set name=new HashSet<>();
		name.add ("Anna");
		name.add("Boris");
		name.add("Kirill");
		name.add("Katja");
		name.add("Kirill");
		
		//2 - Call print method to print the set passed as its parameter.
		print (name);
	}

	
         static void print(Set set) {
			Iterator i=set.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
	}
	}
}

