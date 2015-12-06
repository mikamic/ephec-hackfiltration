package be.ephec.git.first;

public class mainGame {

	public static void main(String[] args){
		Player pl = new Player();
		System.out.println("Vous êtes à la case " + pl.getSquare());
		for(int i=0 ; i < 3 ; i++){
			Dice dice = new Dice();
		}
	}
	
}
