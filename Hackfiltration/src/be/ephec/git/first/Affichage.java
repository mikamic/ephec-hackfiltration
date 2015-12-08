package Interface;

import java.awt.EventQueue;

public class Affichage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Affichage window = new Affichage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Affichage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{307, 143, 0};
		gridBagLayout.rowHeights = new int[]{15, 15, 25, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel floor = new JLabel("Etage");
		GridBagConstraints gbc_floor = new GridBagConstraints();
		gbc_floor.anchor = GridBagConstraints.NORTH;
		gbc_floor.fill = GridBagConstraints.HORIZONTAL;
		gbc_floor.insets = new Insets(0, 0, 5, 0);
		gbc_floor.gridx = 1;
		gbc_floor.gridy = 0;
		frame.getContentPane().add(floor, gbc_floor);
		
		JLabel diceResult = new JLabel("Res. Jet de dé");
		GridBagConstraints gbc_diceResult = new GridBagConstraints();
		gbc_diceResult.anchor = GridBagConstraints.NORTH;
		gbc_diceResult.insets = new Insets(0, 0, 5, 0);
		gbc_diceResult.gridx = 1;
		gbc_diceResult.gridy = 1;
		frame.getContentPane().add(diceResult, gbc_diceResult);
		
		JButton btnLancerLeD = new JButton("Lancer le dé");
		GridBagConstraints gbc_btnLancerLeD = new GridBagConstraints();
		gbc_btnLancerLeD.anchor = GridBagConstraints.NORTH;
		gbc_btnLancerLeD.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLancerLeD.gridx = 1;
		gbc_btnLancerLeD.gridy = 2;
		frame.getContentPane().add(btnLancerLeD, gbc_btnLancerLeD);
	}
}
