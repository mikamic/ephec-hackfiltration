package be.ephec.git.first;

public class mainGame {

	public static void main(String[] args){
		Player pl = new Player();
		Floor fl = new Floor();
		for(int i=0 ; i < 3 ; i++){
			Dice dice = new Dice();
		}
		System.out.println(pl);
		fl.setNumber(pl.getSquare());
		String a = fl.pickAnEvent();
		System.out.println(fl.getNumber() + " " + a);
		Key key;
		if(a == "bonus")
			System.out.println(a);
			key = new Key();
			System.out.println("Vous �tes maintenant � la case n�" + pl.getSquare());
			//PrivateElevator pe = new PrivateElevator();
	}
	
}
