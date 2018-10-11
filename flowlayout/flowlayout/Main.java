package flowlayout;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

	
	public Main() {
		
		this.setBounds(300, 300, 300, 200);
		initComponents();
		
		this.setDefaultCloseOperation(3);
	}
	
	public void initComponents() {
		
		button1.setPreferredSize(new Dimension(150, 100));
		this.getContentPane().add(panel1, BorderLayout.CENTER);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		
	
	}
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");
	JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	
	public static void main(String[] args) {
		new Main().setVisible(true);
		
	}
}
	
