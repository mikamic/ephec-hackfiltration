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
		System.out.println(fl.getNumber() + " " +fl.pickAnEvent());
		//if(fl.pickAnEvent() == "bonus")
			//Key ky = new Key();
			//PrivateElevator pe = new PrivateElevator();
	}
	
}
