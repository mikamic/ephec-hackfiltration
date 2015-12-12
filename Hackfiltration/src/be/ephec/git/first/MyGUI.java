package be.ephec.git.first;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyGUI extends JFrame implements ActionListener{

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
	Player pl = new Player();
	JLabel dfJl = new JLabel(pl.toString());
	
	public MyGUI() {
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("HACKFILTRATION");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		jpNorth.setBackground(Color.BLUE);
		jpSouth.setBackground(Color.CYAN);
		jpEast.setBackground(Color.GREEN);
		jpWest.setBackground(Color.MAGENTA);
		jpCenter.setBackground(Color.GRAY);
		
		jpEast.setPreferredSize(new Dimension(200, this.getContentPane().getHeight()));
		//jpWest.setPreferredSize(new Dimension(200, this.getContentPane().getHeight()));
		
		this.getContentPane().add(jpNorth, BorderLayout.NORTH);
		this.getContentPane().add(jpSouth, BorderLayout.SOUTH);
		this.getContentPane().add(jpEast, BorderLayout.EAST);
		//this.getContentPane().add(jpWest, BorderLayout.WEST);
		this.getContentPane().add(jpCenter, BorderLayout.CENTER);
		
		//Zone de Titre - Title's area
		jpNorth.setPreferredSize(new Dimension(this.getContentPane().getWidth(), 100));
		JLabel myTitle = new JLabel("||  H A C K F I L T R A T I O N  ||");
		Font titleFont = new Font("Tahoma", Font.BOLD, 20);
		myTitle.setFont(titleFont);
		myTitle.setForeground(Color.BLACK);
		jpNorth.add(myTitle);
		
		//Zone du dés - Dice('s) area
		JButton jb = new JButton("Lancer le dés");
		jb.setPreferredSize(new Dimension(150, 100));
		jpEast.add(jb);
		jb.addActionListener(this);
		displayDice.setPreferredSize(new Dimension(150, 50));
		jpEast.add(displayDice);
		displayDice.add(ddJl1);
		displayDice.add(ddJl2);
		displayFloor.setPreferredSize(new Dimension(150, 50));
		jpEast.add(displayFloor);
		displayFloor.add(dfJl);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		Dice di = new Dice();
		ddJl1.setText("Vous avez obtenu : ");
		JLabel jl = new JLabel(di.toString());
		ddJl2.setText(di.toString());
		dfJl.setText(pl.toString());
		//Font diceFont = new Font("Tahoma", Font.BOLD, 16);
		//ddJl.setFont(diceFont);
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}

	
}
