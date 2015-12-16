package be.ephec.coreapp;

public class Player {

	private static int currentSquare = 0; //n� de la case
	

	public Player() {
		
	}

	//Getters, setters and toString
	public int getSquare() {
		return currentSquare;
	}

	public void setSquare(int square) {
		currentSquare = square;
	}
	
	public String toString() {
		return "Etage actuel: " + currentSquare;
	}
	
}
