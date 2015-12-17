package be.ephec.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import be.ephec.controller.*;
import be.ephec.coreapp.ScoreUpload;

public class MainGUI extends JFrame implements ActionListener{

	JPanel pan = new JPanel();
	JPanel jpNorth = new JPanel();
	JPanel jpSouth = new JPanel();
	JPanel jpEast = new JPanel();
	JPanel jpWest = new JPanel();
	JPanel jpCenter = new JPanel();
	JPanel displayDice = new JPanel();
	JPanel displayFloor = new JPanel();
	JPanel displayEvent = new JPanel();
	JLabel diceField = new JLabel("Veuillez lancer le dés");
	JLabel eventField = new JLabel("Evenement");
	JLabel floorField = new JLabel("Etage actuel: 0");


	public MainGUI() throws IOException {
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("HACKFILTRATION");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		jpNorth.setBackground(Color.BLUE);
		jpSouth.setBackground(Color.GRAY);
		jpEast.setBackground(Color.GREEN);
		jpWest.setBackground(Color.MAGENTA);
		jpCenter.setBackground(Color.GRAY);
		
		jpEast.setPreferredSize(new Dimension(200, this.getContentPane().getHeight()));
		
		this.getContentPane().add(jpNorth, BorderLayout.NORTH);
		this.getContentPane().add(jpSouth, BorderLayout.SOUTH);
		this.getContentPane().add(jpEast, BorderLayout.EAST);
		this.getContentPane().add(jpCenter, BorderLayout.CENTER);
		
		
		
		//Zone de Titre
		jpNorth.setPreferredSize(new Dimension(this.getContentPane().getWidth(), 100));
		JLabel myTitle = new JLabel("||  H A C K F I L T R A T I O N  ||");
		Font titleFont = new Font("Tahoma", Font.BOLD, 20);
		myTitle.setFont(titleFont);
		myTitle.setForeground(Color.RED);
		jpNorth.add(myTitle);
		
		//Zone du dé
		JButton jb = new JButton("Lancer le dés");
		jb.setPreferredSize(new Dimension(180, 100));
		jpEast.add(jb);
		jb.addActionListener(this);
		displayDice.setPreferredSize(new Dimension(180, 50));
		jpEast.add(displayDice);
		displayDice.add(diceField);
		displayFloor.setPreferredSize(new Dimension(180, 50));
		jpEast.add(displayFloor);
		displayFloor.add(floorField);
		displayEvent.setPreferredSize(new Dimension(this.getContentPane().getWidth(), 50));
		jpNorth.add(displayEvent);
		displayEvent.add(eventField);
		
		
		/*Zone de l'image - Elle ne s'affiche qu'après le premier lancer de dés, à corriger avec le controlleur.
		Aussi, il faut mettre l'image à la racine du projet, à côté des dossiers "src" et "bin", sinon il ne la trouvera
		pas. Idéalement, l'image doit être en 650p X 450p, sinon elle sera coupée.*/
		BufferedImage img = ImageIO.read(new File("images/office2.jpg"));
		JLabel imgJLabel = new JLabel(new ImageIcon(img));
		imgJLabel.setPreferredSize(new Dimension(650, 450));
		jpCenter.add(imgJLabel);

	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		MainController controller = new MainController();
			try {
				controller.playerTurn();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			int square = controller.getSquare();
			if (square < 150){	
			diceField.setText("Résultat du jet de dé: " + controller.getDiceResult());
			floorField.setText("Etage actuel: " + square);
			String event = controller.getChoice();
			if (event == "clef" || event == "ascenceur privatif"){
				eventField.setText("Vous avez trouvé le bonus: " + event + ", avancez de " + controller.getModifier() + " étage(s) supplémentaire(s)");
			}
			else if	(event == "concierge" || event == "gardien"){
				eventField.setText("Vous êtes tombé le " + event + ", reculez de " + controller.getModifier() + " étage(s)");	
			}
			else{
				eventField.setText("Rien de particulier à signaler");
			}
			}
			else{
				try {
					new ScoreUpload();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
	}		
}
	
