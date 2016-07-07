package main;

import java.util.ArrayList;
import java.util.Collection;

import aspirateur.Aspirateur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// création de l'entré pour l'aplication
		Collection <String> collection = new ArrayList<String>();
		collection.add("10 10");
		collection.add("5 5 N");
		collection.add("DADADADAA");
		
		// initialisation des variables positions et directive
		String position_debut=null;
		String directive=null;
		
		// séparation de l'entré pour différencier la taille de la grille, la position de départ, et les directives
		for(String current : collection){
			
			String tab_temp_info[] = current.split(" ");
						
			if(tab_temp_info.length == 1)
				directive = current;							
										
			if(tab_temp_info.length == 3)
				position_debut = current;
		}
		
		// instanciation de l'aspirateur Bobi avec son nom ça position et ses directives
		Aspirateur Bobi = new Aspirateur("Bobi",position_debut,directive);
		
		// utilisation de la méthode analyse directive qui va lire .. les directives ( DADADADAA )
		Bobi.analyse_directive();
		
		// position final
		Bobi.positionFinal();

	}

}
