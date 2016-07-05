package main;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection <String> collection = new ArrayList<String>();
		collection.add("10 10");
		collection.add("5 5 N");
		collection.add("DADADADAA");
		
		for(String current : collection){
			
			String tab_temp_info[] = current.split(" ");
			if(tab_temp_info.length == 0)
				System.out.println("0 => "+current);
			
			if(tab_temp_info.length == 1)
				System.out.println(" 1 => "+current);
			
			if(tab_temp_info.length == 2)
				System.out.println(" 2 => "+current);
			
			if(tab_temp_info.length == 3)
				System.out.println(" 3 => "+current);
			
				
		}
			
		

	}

}
