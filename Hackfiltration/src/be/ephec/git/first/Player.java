package be.ephec.git.first;

public class Player {

	private int square; //n° de la case

	public Player() {
		
	}
	
	public void moveForward(int square) {
		this.square = this.square + square;
	}

	//Getters, setters and toString
	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}
	
	public String toString() {
		return "Le joueur est à la case n°" + this.square;
	}
	
}
