package main;

import java.util.ArrayList;
import java.util.Collection;

import aspirateur.Aspirateur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection <String> collection = new ArrayList<String>();
		collection.add("10 10");
		collection.add("5 5 N");
		collection.add("DADADADAA");
		
		String position_debut=null;
		String directive=null;
		
		
		for(String current : collection){
			
			String tab_temp_info[] = current.split(" ");
						
			if(tab_temp_info.length == 1){
				System.out.println(" 1 => "+current);
				directive = current;
			}
				
			
			if(tab_temp_info.length == 2)
				System.out.println(" 2 => "+current);
			
			if(tab_temp_info.length == 3){
				System.out.println(" 3 => "+current);
				position_debut = current;
				//System.out.println(position_debut);
			}
				
			
				
		}
		
		Aspirateur Bobi = new Aspirateur(position_debut,directive);
			
		

	}

}
