package be.ephec.git.first;

public abstract class NPC {

	int malus; //nbre de case que le pion doit reculer

	public void moveBackward(int malus) {
		Player pl = new Player();
		pl.setSquare(pl.getSquare() - malus);
		System.out.println("vous �tes � la case " + pl.getSquare());
	}
	
	public void displayMalusMessage(String npc, int number) {
		System.out.println("Pas de chance, vous �tes tomb� sur " + npc + ".\nReculez de " + number + " cases.");
	}
}
