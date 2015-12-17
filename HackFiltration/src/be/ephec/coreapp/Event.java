package be.ephec.coreapp;

/**
 * Classe utilisée pour déterminer quel évènement aléatoire va se produire.
 * @return String renvoie un string décrivant la nature de l'évènement.
 * */
public class Event {
	
	public String pickTypeOfEvent() {
		int random = (int)(Math.random()*100);
		if(random >= 0 && random < 30)
			return "bonus";
		else if(random >= 30 && random < 50)
			return "malus";
		else
			return "nothing";
	}
}
