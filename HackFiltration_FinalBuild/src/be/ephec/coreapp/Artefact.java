package be.ephec.coreapp;

import javax.swing.JOptionPane;

public abstract class Artefact {

	private int bonus; //nbre de case que le pion peut passer
	
	public Artefact() {
		
	}
	
	public Artefact(int bonus, String arte) {
		moveForward(bonus);
		displayBonusMessage(arte, bonus);
	}
	
	public void moveForward(int bonus) {
		Player pl = new Player();
		pl.setSquare(pl.getSquare() + bonus);
	}
	
	public void displayBonusMessage(String artefact, int number) {
		String msg = "Quelle chance, vous êtes tombé sur " + artefact + "!\nAvancez de " + number + " étages.";
		System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg);
	}
	
}
