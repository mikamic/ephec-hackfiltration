package be.ephec.coreapp;

public class Floor {
	
	public Floor() {
		pickAnEvent();
	}
	
	public void pickAnEvent() {
		Player pl = new Player();
		String a = pickTypeOfEvent();
		int random2 = (int) (Math.random()*100);
		if(a == "bonus") {
			System.out.println(a);
				if (random2 < 50){
					new Key();
				}
				else{
					new PrivateElevator();
				}
			System.out.println("Vous êtes maintenant à l'étage n°" + pl.getSquare());
		}
		else if(a == "malus"){
			System.out.println(a);
				if (random2 < 50){
					new Janitor();
				}
				else{
					new Security();
				}
			System.out.println("Vous êtes maintenant à l'étage n°" + pl.getSquare());
		}
		else if(a == "fail")
			System.out.println("Cet étage est tranquille");
	}
	
	public String pickTypeOfEvent() {
		int random = (int)(Math.random()*100);
		if(random >= 0 && random < 30)
			return "bonus";
		else if(random >= 30 && random < 50)
			return "malus";
		else
			return "fail";
	}
}
