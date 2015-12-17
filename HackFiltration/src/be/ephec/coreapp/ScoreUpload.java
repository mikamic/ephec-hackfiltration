package be.ephec.coreapp;
/**
* Classe "socket" qui permet d'envoyer au serveur le nom du joueur.
 */

import javax.swing.JOptionPane;
import java.net.*;
import java.io.*;

public class ScoreUpload {
	public ScoreUpload() throws UnknownHostException, IOException {
		JOptionPane.showMessageDialog(null, "Fini!\n Maintenant on va envoyer le score au serveur.");
		String name = JOptionPane.showInputDialog("Nom du joueur: ");
		String serverAddress = JOptionPane.showInputDialog("Adresse du Serveur: ");
		Socket socket = new Socket(serverAddress, 8080);
		//socket.setSoTimeout(200000);
		ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
		output.writeObject("Le joueur " + name + " a terminé le jeu !");
		socket.close();
		System.exit(0);
	}

}
