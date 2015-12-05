package be.ephec.git.first;

public abstract class Artefact {

	int bonus; //nbre de case que le pion peut passer
	
	public Artefact() {
		
	}
	
	public Artefact(int bonus, String arte) {
		moveForward(bonus);
		displayBonusMessage(arte, bonus);
	}
	
	public void moveForward(int bonus) {
		Player pl = new Player();
		pl.setSquare(pl.getSquare() + bonus);
		System.out.println("vous êtes à la case " + pl.getSquare());
	}
	
	public void displayBonusMessage(String artefact, int number) {
		System.out.println("Quelle chance, vous êtes tombé sur " + artefact + "!\nAvancez de " + number + " cases.");
	}
}
