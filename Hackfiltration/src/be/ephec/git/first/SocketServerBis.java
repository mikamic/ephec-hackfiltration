
import java.net.*;
import java.io.*;

public class SocketServerBis {

public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	ServerSocket server = new ServerSocket(8080);
	System.out.println("Le serveur est démarré sur le port 8080 !");
	//server.setSoTimeout(15000);
	Socket socket = server.accept();
	ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
	System.out.println(input.readObject());
	socket.close();
	System.exit(0);
	}
	
}
