package be.ephec.git.first;

public class Floor {

	private int number;
	
	public Floor() {
		pickAnEvent();
	}
	
	public void pickAnEvent() {
		Player pl = new Player();
		String a = pickTypeOfEvent();
		if(a == "bonus") {
			System.out.println(a);
			Key key = new Key();
			System.out.println("Vous êtes maintenant à la case n°" + pl.getSquare());
			//PrivateElevator pe = new PrivateElevator();
		}
		else if(a == "malus"){
			System.out.println(a);
			Janitor jt = new Janitor();
			System.out.println("Vous êtes maintenant à la case n°" + pl.getSquare());
		}
		else if(a == "fail")
			System.out.println("C'est étage est tranquile");
	}
	
	public String pickTypeOfEvent() {
		if(pickALevel() == "bonus")
			return "bonus";
		else if(pickALevel() == "malus")
			return "malus";
		else
			return "fail";
	}
	
	public String pickALevel() {
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
