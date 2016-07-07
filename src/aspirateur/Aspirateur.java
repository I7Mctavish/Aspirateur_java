package aspirateur;

public class Aspirateur {
	
	private String name;
	private int position_X;
	private int position_Y;
	private points_cardinaux direction_enum = null;
	private String directive;
	
	
	public Aspirateur(String name, String position_debut,String directive){

		String position_debut_tab[] = position_debut.split(" ");
		
		this.name = name;
		this.position_X = Integer.parseInt(position_debut_tab[0]);
		this.position_Y = Integer.parseInt(position_debut_tab[1]);
		this.directive = directive;
		directionInitiale(position_debut_tab[2]);
	}	
	
	private void directionInitiale(String direction_init){
		if(direction_init.equals("N") )
			this.direction_enum = points_cardinaux.N;
		else if(direction_init.equals("E"))
			this.direction_enum = points_cardinaux.E;
		else if(direction_init.equals("S"))
			this.direction_enum = points_cardinaux.S;
		else if(direction_init.equals("W"))
			this.direction_enum = points_cardinaux.W;
	}
	
	// Méthode analyse qui va prendre chaque caractère de la variable String "directive" et qui fait un SWITCH en fonction de la lettre
	
	public void analyse_directive(){

		for(int i = 0;i<this.directive.length();i++){
			
			switch(directive.charAt(i)){
			case 'A':
				move();
				break;
				
			case 'D':
				rotationDroite_enum();
				break;

			case 'G':
				rotationGauche_enum();
				break;
			}
		}

	}
	
	// En fonction de la direction la méthode move change l'attribut correspondant 
	
	private void move(){		
	
		if(this.direction_enum == points_cardinaux.N)
			this.position_Y++;
		
		if(this.direction_enum == points_cardinaux.S)
			this.position_Y--;
		
		if(this.direction_enum == points_cardinaux.E)
			this.position_X++;
		
		if(this.direction_enum == points_cardinaux.W)
			this.position_X--;
		
			
	}
	
	// Change la direction en fonction de la direction
	private void rotationDroite_enum(){
		
		if(this.direction_enum == points_cardinaux.N)
			this.direction_enum = points_cardinaux.E;
		else if(this.direction_enum == points_cardinaux.E)
			this.direction_enum = points_cardinaux.S;
		else if(this.direction_enum == points_cardinaux.S)
			this.direction_enum = points_cardinaux.W;
		else if(this.direction_enum == points_cardinaux.W)
			this.direction_enum = points_cardinaux.N;
		
	}
	
	// Change la direction en fonction de la direction
	private void rotationGauche_enum(){
		
		if(this.direction_enum == points_cardinaux.N)
			this.direction_enum = points_cardinaux.W;
		else if(this.direction_enum == points_cardinaux.W)
			this.direction_enum = points_cardinaux.S;
		else if(this.direction_enum == points_cardinaux.S)
			this.direction_enum = points_cardinaux.E;
		else if(this.direction_enum == points_cardinaux.E)
			this.direction_enum = points_cardinaux.N;
		
	}
	
	public void positionFinal(){
		System.out.println(this.name + " " + this.position_X + " " + this.position_Y + " " + this.direction_enum);
	}

}
