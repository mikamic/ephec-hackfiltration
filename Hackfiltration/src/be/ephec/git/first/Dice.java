package be.ephec.git.first;

public class Dice {
	
	int myDice = throwOfTheDice();
	
	public Dice() {
		displayDiceMessage();
		moveForward();
		Floor fl = new Floor();
		Player pl = new Player();
		fl.setNumber(pl.getSquare());
	}
	
	public void moveForward() {
		Player pl = new Player();
		pl.setSquare(pl.getSquare() + myDice);
		System.out.println("vous êtes à la case " + pl.getSquare());
	}
	
	public void displayDiceMessage() {
		System.out.println("\nVous avez obtenu un " + myDice);
	}
	
	/**
	 * Définit la face du dés à afficher
	 * Define wich side of the dice
	 * @return integer between 0 and 6
	 */
	public int throwOfTheDice() {
		int random = (int)(Math.random()*100);
		//System.out.println(random);
		if(random >= 0 && random < 100/6)
			return 1;
		else if(random >= 100/6 && random < 2*100/6)
			return 2;
		else if(random >= 2*100/6 && random < 3*100/6)
			return 3;
		else if(random >= 3*100/6 && random < 4*100/6)
			return 4;
		else if(random >= 4*100/6 && random < 5*100/6)
			return 5;
		else if(random >= 5*100/6 && random < 100)
			return 6;
		else
			return 0;
	}

	public String toString() {
		return "" + myDice;
	}
}
