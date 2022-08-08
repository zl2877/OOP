import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainGUI extends JFrame {

	static JFrame f;
	static JPanel mainpanel;
	static JButton b, b1, b2;
	static JLabel lb1;
	
	/*
	public void btnAdd_click() {
		AddGUI addgui=new AddGUI();
		addgui.show();
	}
	
	public void btnCart_click() {
		CartGUI cartgui= new CartGUI();
		cartgui.show();
	}
	*/
	public MainGUI() {
		
		f = new JFrame("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel mainpanel = new JPanel();
		mainpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainpanel);
		mainpanel.setLayout(null);
		
		JLabel lb1 = new JLabel("Welcome to our boba tea shop");
		lb1.setBounds(126, 30, 204, 29);

		
		 b = new JButton("Start Order");
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// b();
				}
			});
	     b1 = new JButton("View Cart");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// b1();
				}
			});
	  
	     b.setBounds(110, 90, 239, 16);
	     b1.setBounds(110, 140, 239, 16);
	   
	     
	     mainpanel.add(b);
	     mainpanel.add(b1);
		mainpanel.add(lb1);
	     //f.add(mainpanel);
	    // f.setSize(300, 300);

	}
}
