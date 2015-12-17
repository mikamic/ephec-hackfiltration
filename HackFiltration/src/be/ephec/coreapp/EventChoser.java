package be.ephec.coreapp;
/**
 *  Classe qui détermine l'évènement aléatoire qui se produit.
 * @param a String sert à déterminer si on utilise un bonus ou un malus
 *
 */
public class EventChoser {
	
	public String eventPick(String a) {
		int random2 = (int) (Math.random()*100);
		if(a == "bonus") {
				if (random2 < 70){
					return "clef";
				}
				else{
					return "ascenceur privatif";
				}
		}
		else if(a == "malus"){
				if (random2 < 70){
					return "concierge";
				}
				else{
					return "gardien";
				}
		}
		else
			return "Rien à signaler";
	}
}