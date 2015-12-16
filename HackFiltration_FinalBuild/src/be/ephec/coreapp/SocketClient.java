package be.ephec.coreapp;
import javax.swing.JOptionPane;
import java.net.*;
import java.io.*;

public class SocketClient {
	public static void main(String[] args) throws IOException {
		String serverAddress = JOptionPane.showInputDialog("Adresse du Serveur SVP: ");
		Socket socket = new Socket(serverAddress, 8080);
		ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
		output.writeObject("Coucou, voici un message du client !");
		socket.close();
		System.exit(0);
	}

}
