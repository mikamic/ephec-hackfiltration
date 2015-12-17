package be.ephec.coreapp;
/**
 *  Classe qui détermine la valeur numérique du bonus/malus
 * @param event String évènement qui se produit
 *@return int valeur du bonus/malus
 */
public class Modifier {

	public int getModifier(String event){
		int value;
		switch (event){
		case "clef": value = 1;
		break;
		case "ascenceur privatif": value = 3;
		break;
		case "concierge": value = -1;
		break;
		case "gardien": value = -4;
		break;
		default: value = 0;
		break;
		}
		return value;
	}
}
