package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();
		list.add ("Anna");
	    list.add ("Bob");
	    list.add ("Charlie");
		
		ListActivity obj=new ListActivity();
	    obj.print(list);//2 - Call print method to print the list passed as its parameter.
		
	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		Iterator i=list.iterator();//Iterator is an interface which provides a uniform way to access
		//individual elements of a Collection
		while (i.hasNext()) {
		//2 - Use Iterator to iterate over this list.
			System.out.println (i.next());
			}//Notice the order in which elements get printed.
	
	}
}

