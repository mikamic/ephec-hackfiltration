package be.ephec.coreapp;

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
