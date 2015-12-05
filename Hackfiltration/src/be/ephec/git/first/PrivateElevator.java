package be.ephec.git.first;

public class PrivateElevator extends Artefact{

	int bonus = 2;
	
	public PrivateElevator() {
		super.moveForward(bonus);
		super.displayBonusMessage("clé", bonus);
	}
}
