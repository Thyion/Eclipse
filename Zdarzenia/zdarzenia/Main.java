package zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{

	public Main() {
		super("Zdarzenia");
		this.setBounds(300, 300, 300, 200);
		initComponents();
		this.setDefaultCloseOperation(3);
	}
	
	public void initComponents() {
		kolorCzerwony = new JButton("Czerwony");
		panel.add(kolorCzerwony);
		this.getContentPane().add(panel);
	}
	
	JPanel panel = new JPanel();
	JButton kolorCzerwony;

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}

