package be.ephec.git.first;

public class mainGame {

	public static void main(String[] args){
		Player pl = new Player();
		for(int i=0 ; i < 3 ; i++){
			Dice dice = new Dice();
			System.out.println(dice.getChosenSide());
			pl.moveForward(dice.getChosenSide());
			System.out.println(pl.getSquare());
		}
		System.out.println(pl);
		
	}
	
}
