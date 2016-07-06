package aspirateur;

public class Aspirateur {
	
	//private points_cardinaux direction;
	private int position_X;
	private int position_Y;
	private String direction;
	
	public Aspirateur(String position_debut,String directive){
		
		String position_debut_tab[] = position_debut.split(" ");
		for(String current : position_debut_tab)
			System.out.println(current);
		
		for(int i =0;i<position_debut_tab.length;i++)
			System.out.println("position_debut tab " + i + " = "+position_debut_tab[i]);
		
		
		this.direction = position_debut_tab[2];
		this.position_X = Integer.parseInt(position_debut_tab[0]);
		this.position_Y = Integer.parseInt(position_debut_tab[1]);
		
		System.out.println(this.getClass()+ " se trouve à la position X = "+this.position_X+" Y = "+this.position_Y
				+" et dans la direction "+this.direction);
		
		
	}
		
	public String getDirection() {
		return direction;
	}
	public int getPosition_X() {
		return position_X;
	}
	public int getPosition_Y() {
		return position_Y;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public void setPosition_X(int position_X) {
		this.position_X = position_X;
	}
	public void setPosition_Y(int position_Y) {
		this.position_Y = position_Y;
	}

}
