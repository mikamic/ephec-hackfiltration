package be.ephec.git.first;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Display extends JFrame implements ActionListener{

	public Display() {
		this.setBounds(400, 300, 300, 200);
		this.setVisible(true);
		this.setTitle("HACKFILTRATION");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//addMouseListener(new MouseAdapter(){public void mouseClicked (MouseEvent ev) {}});
		JButton jbou = new JButton("lancer le dés");
		jbou.addActionListener(this);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(jbou);
	}
	
	public static void main(String[] artgs) {
		Display dis = new Display();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Dice();
	}
}
