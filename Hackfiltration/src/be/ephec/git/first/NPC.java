package be.ephec.git.first;

public abstract class NPC {

	int malus; //nbre de case que le pion doit reculer

	public NPC() {
		
	}
	
	public NPC(int malus, String npc) {
		displayMalusMessage(npc, malus);
		moveBackward(malus);
	}
	
	public void moveBackward(int malus) {
		Player pl = new Player();
		//System.out.println("vous �tes � la case " + pl.getSquare());
		if((pl.getSquare() - malus) < 0) {
			System.out.println("Mais que faites-vous donc � la cave ?\nRetournez au rez-de-chauss�e");
			pl.setSquare(0);
		}
		else
			pl.setSquare(pl.getSquare() - malus);
	}
	
	public void displayMalusMessage(String npc, int number) {
		System.out.println("Pas de chance, vous �tes tomb� sur " + npc + ".\nReculez de " + number + " cases.");
	}
}
