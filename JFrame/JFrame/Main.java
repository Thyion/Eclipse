package JFrame;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

	public Main() {
		
		/*
		JFrame frame = new JFrame();
		frame.setTitle("Rameczka");
		//frame.setSize(300, 300);
		frame.setMinimumSize(new Dimension(100,100));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLocation(200, 200);
		frame.setBounds(300, 300, 200, 200);
		//frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("ikona.jpg"));
		*/
		super("Uk³ad graficzny (Layout)");
		this.setBounds(300, 320, 300, 200);
		this.setDefaultCloseOperation(3);
		
		int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
		int wys = Toolkit.getDefaultToolkit().getScreenSize().height;
		System.out.println(szer + " x " + wys);
		
		this.setSize(szer/2, wys/2);
		initComponents();
		//this.pack(); //dostosowuje okienko na starcie do wielkosci butonow
		
	}
	
	public void initComponents() {
		Container kontener = this.getContentPane();
		centrum = new JButton("Guzik");
		gora = new JButton("gora_guzik");
		dol = new JButton("dol_guzik");
		prawo = new JButton("prawo_guzik");
		lewo = new JButton("lewo_guzik");
		kontener.setLayout(null); //manager ukladów jest dezaktywowany wiec sami
		kontener.add(centrum);
		centrum.setLocation(50, 50);//musimy ustawiac gdzie beda guziki
		centrum.setSize(100, 20); // i jak duze beda
									
		
//		kontener.add(centrum, BorderLayout.CENTER);
//		kontener.add(gora, BorderLayout.PAGE_START);
//		kontener.add(dol, BorderLayout.PAGE_END);
//		kontener.add(prawo, BorderLayout.EAST);
//		kontener.add(lewo, BorderLayout.WEST);
//	
	}
	
	JButton centrum;
	JButton gora;
	JButton dol;
	JButton prawo;
	JButton lewo;
	
	public static void main(String[] args) {
		//new Main();
		new Main().setVisible(true);
	}
	
}
