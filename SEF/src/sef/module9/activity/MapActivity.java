package sef.module9.activity;
//Needs to be completed

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
				
				Map map = new HashMap();
				map.put("1", "Anna");
				map.put("2", "Kirill");
				map.put("3", "Olga");
				map.put("4", "Inga");
				map.put("5", "Irina");
				
											
				new MapActivity().print(map);
				
		}//2 - Call print method to print the map passed as its parameter.
		
	
		void print(Map map)
		{
			Set keySet = map.keySet();
			
			//You can use an iterator to access keys
			System.out.println("Id\tName");
			Iterator it=keySet.iterator();
			while(it.hasNext()){//3 - Type code to print this map
			
			String key=(String)it.next();
			System.out.println(key+"\t"+map.get(key));
		}
		}
}
