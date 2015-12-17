package be.ephec.controller;
import java.io.IOException;

import javax.swing.JLabel;

import be.ephec.coreapp.*;
import be.ephec.gui.*;

public class MainController {
		static int square = 0;
		static String choice;
		static int diceResult;
		static int modifier;
		

	public static void main(String[] args) throws IOException {
		MainGUI gui = new MainGUI();
		

	}
	
	public void playerTurn() throws IOException{
		Dice dice = new Dice();
		Event event = new Event();
		EventChoser choser = new EventChoser();
		Modifier mod = new Modifier();
			System.out.println(square);
		diceResult = dice.diceThrow();
			System.out.println(diceResult);
		square = square + diceResult;
			System.out.println(square);
		String eventType = event.pickTypeOfEvent();
			System.out.println(eventType);
		choice = choser.eventPick(eventType);
			System.out.println(choice);
		modifier = mod.getModifier(choice);
			System.out.println(modifier);
		int actualSquare = square + modifier;
			if (actualSquare < 0){actualSquare = 0;}
		square = actualSquare;	
			System.out.println(square);
	}

	public static int getSquare() {
		return square;
	}

	public static String getChoice() {
		return choice;
	}

	public static int getDiceResult() {
		return diceResult;
	}
	
	public static int getModifier(){
		return modifier;
		
	}

}
