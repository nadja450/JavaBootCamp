package sef.module9.sample;
//Needs to be completed
import java.util.*;

public class SetSample {
	public static void main(String[] args) {
		//1 - Create a new HashSet and name it monthSet
		Set monthset=new HashSet<>();
		//2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		//System.out.println(monthSet.add("January"));
monthset.add ("Jan");
monthset.add("Febr");
monthset.add("March");
		//System.out.println("Output : ");
		//3 - Iterate through the HashSet and print all the months.
		
		print (monthset);//You'd notice that duplicate names are not printed. 
	
}
 static void print (Set set){
	Iterator i=set.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
	}
 }
