package be.ephec.coreapp;

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
