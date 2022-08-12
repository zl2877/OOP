package BubbleTea;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnStart;
	private JLabel lblWelcome;
	
	
	public void btnAdd_click() {
		AddGUI addgui=new AddGUI();
		addgui.show();
	}
	public MainGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnStart = new JButton("Start Order");
		
		btnStart.setForeground(UIManager.getColor("Button.select"));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAdd_click();
			}
		});
		btnStart.setBounds(154, 121, 117, 29);
		contentPane.add(btnStart);
		
		lblWelcome = new JLabel("Welcome to our online ordering system for bubble tea!");
		lblWelcome.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblWelcome.setForeground(Color.PINK);
		lblWelcome.setBounds(27, 44, 417, 41);
		contentPane.add(lblWelcome);
		
		
		
	}
}
