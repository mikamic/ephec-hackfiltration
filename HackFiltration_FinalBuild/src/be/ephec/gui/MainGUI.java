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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Icon;

import be.ephec.coreapp.Artefact;
import be.ephec.coreapp.Dice;
import be.ephec.coreapp.Player;
import be.ephec.coreapp.ScoreUpload;

public class MainGUI extends JFrame implements ActionListener{

	JPanel pan = new JPanel();
	JPanel jpNorth = new JPanel();
	JPanel jpSouth = new JPanel();
	JPanel jpEast = new JPanel();
	JPanel jpWest = new JPanel();
	JPanel jpCenter = new JPanel();
	JPanel displayDice = new JPanel();
	JLabel ddJl1 = new JLabel("Veuillez lancer le dés");
	JLabel ddJl2 = new JLabel("");
	JPanel displayFloor = new JPanel();
	/*JPanel displayEvent = new JPanel();
	JLabel event = new JLabel("Evenement");*/
	Player pl = new Player();
	JLabel dfJl = new JLabel(pl.toString());
	
	
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
		
		
		
		//Zone de Titre - Title's area
		jpNorth.setPreferredSize(new Dimension(this.getContentPane().getWidth(), 100));
		JLabel myTitle = new JLabel("||  H A C K F I L T R A T I O N  ||");
		Font titleFont = new Font("Tahoma", Font.BOLD, 20);
		myTitle.setFont(titleFont);
		myTitle.setForeground(Color.RED);
		jpNorth.add(myTitle);
		
		//Zone du dés - Dice('s) area
		JButton jb = new JButton("Lancer le dés");
		jb.setPreferredSize(new Dimension(180, 100));
		jpEast.add(jb);
		jb.addActionListener(this);
		displayDice.setPreferredSize(new Dimension(180, 50));
		jpEast.add(displayDice);
		displayDice.add(ddJl1);
		displayDice.add(ddJl2);
		displayFloor.setPreferredSize(new Dimension(180, 50));
		jpEast.add(displayFloor);
		displayFloor.add(dfJl);
		/*displayEvent.setPreferredSize(new Dimension(this.getContentPane().getWidth(), 50));
		jpNorth.add(displayEvent);
		displayEvent.add(event);*/
		
		
		/*Zone de l'image - Elle ne s'affiche qu'après le premier lancer de dés, à corriger avec le controlleur.
		Aussi, il faut mettre l'image à la racine du projet, à côté des dossiers "src" et "bin", sinon il ne la trouvera
		pas. Idéalement, l'image doit être en 650p X 450p, sinon elle sera coupée.*/
		BufferedImage img = ImageIO.read(new File("images/office2.jpg"));
		JLabel imgJLabel = new JLabel(new ImageIcon(img));
		imgJLabel.setPreferredSize(new Dimension(650, 450));
		jpCenter.add(imgJLabel);

	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		int s = pl.getSquare();
		int c = 0;
		if (s < 20) {
		Dice di = new Dice();
		ddJl1.setText("Vous avez obtenu : ");
		JLabel jl = new JLabel(di.toString());
		ddJl2.setText(di.toString());
		dfJl.setText(pl.toString());
		c++;
		}
		else {
			new ScoreUpload();
		}
	}
	
}
