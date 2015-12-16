package be.ephec.git.first;

public abstract class NPC {

	int malus; //nbre de case que le pion doit reculer

	public NPC() {
		
	}
	
	public NPC(int malus, String npc) {
		moveBackward(malus);
		displayMalusMessage(npc, malus);
	}
	
	public void moveBackward(int malus) {
		Player pl = new Player();
		System.out.println("vous êtes à la case " + pl.getSquare());
		if((pl.getSquare() - malus) < 0)
			pl.setSquare(0);
		else
			pl.setSquare(pl.getSquare() - malus);
	}
	
	public void displayMalusMessage(String npc, int number) {
		System.out.println("Pas de chance, vous êtes tombé sur " + npc + ".\nReculez de " + number + " cases.");
	}
}
