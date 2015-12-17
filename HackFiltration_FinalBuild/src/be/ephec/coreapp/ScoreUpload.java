package be.ephec.coreapp;

import javax.swing.JOptionPane;
import java.net.*;
import java.io.*;

public class ScoreUpload {
	public static void main(String[] args) throws UnknownHostException, IOException {
		int score = (int)(Math.random()*100);
		JOptionPane.showMessageDialog(null, "Fini!\n Maintenant on va UL le score sur le serveur.");
		String name = JOptionPane.showInputDialog("Nom du joueur: ");
		String serverAddress = JOptionPane.showInputDialog("Adresse du Serveur SVP: ");
		Socket socket = new Socket(serverAddress, 8080);
		//socket.setSoTimeout(200000);
		ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
		output.writeObject(name + " " + score);
		socket.close();
		System.exit(0);
	}

}
