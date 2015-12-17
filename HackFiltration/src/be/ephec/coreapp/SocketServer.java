package be.ephec.coreapp;
/**
 * Classe "socket" jumelle de ScoreUpload, et qui permet de recevoir le nom du joueur.
 */

import java.net.*;

import javax.swing.JOptionPane;

import java.io.*;

public class SocketServer {

public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	ServerSocket server = new ServerSocket(8080);
	System.out.println("Le serveur est démarré sur le port 8080 !");
	//server.setSoTimeout(15000);
	Socket socket = server.accept();
	ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
	String content = (String) input.readObject();
	JOptionPane.showMessageDialog(null, content);
	System.out.println(content);
	socket.close();
	System.exit(0);
	}
	
}
