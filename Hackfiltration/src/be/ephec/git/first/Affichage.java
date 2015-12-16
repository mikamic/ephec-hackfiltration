package be.ephec.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class Affichage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Affichage frame = new Affichage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Affichage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel diceResult = new JLabel("R\u00E9sultat du jet de d\u00E9s");
		GridBagConstraints gbc_diceResult = new GridBagConstraints();
		gbc_diceResult.fill = GridBagConstraints.HORIZONTAL;
		gbc_diceResult.insets = new Insets(0, 0, 5, 5);
		gbc_diceResult.gridx = 12;
		gbc_diceResult.gridy = 0;
		contentPane.add(diceResult, gbc_diceResult);
		
		JLabel floorLevel = new JLabel("Etage actuel");
		GridBagConstraints gbc_floorLevel = new GridBagConstraints();
		gbc_floorLevel.insets = new Insets(0, 0, 5, 5);
		gbc_floorLevel.gridx = 12;
		gbc_floorLevel.gridy = 1;
		contentPane.add(floorLevel, gbc_floorLevel);
		
		JButton throwDice = new JButton("Lancer le d\u00E9");
		GridBagConstraints gbc_throwDice = new GridBagConstraints();
		gbc_throwDice.insets = new Insets(0, 0, 0, 5);
		gbc_throwDice.gridx = 12;
		gbc_throwDice.gridy = 2;
		contentPane.add(throwDice, gbc_throwDice);
	}

}
