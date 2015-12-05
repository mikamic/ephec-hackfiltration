package be.ephec.git.first;

public class Floor {

	private int number;
	
	public Floor() {
		
	}
	
	public String pickAnEvent() {
		if(number >= 0 && number < 100)
			return EventOfLevel1();
		else if(number >= 100 && number < 150)
			return EventOfLevel2();
		else if(number == 150)
			return "You win";
		else
			return "fail ?";
	}
	
	public String EventOfLevel1() {
		int random = (int)(Math.random()*100);
		if(random >= 0 && random < 100/3)
			return "bonus";
		else if(random >= 100/3 && random < 2*100/3)
			return "malus";
		else if(random >= 2*100/3 && random < 3*100/3)
			return "the floor is empty";
		else
			return "fail ?";
	}
	
	public String EventOfLevel2() {
		int random = (int)(Math.random()*100);
		if(random >= 0 && random < 3*100/6)
			return "bonus";
		else if(random >= 3*100/6 && random < 4*100/6)
			return "malus";
		else if(random >= 4*100/6 && random < 100)
			return "the floor is empty";
		else
			return "fail ?";
	}
	
	//Getters and setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
