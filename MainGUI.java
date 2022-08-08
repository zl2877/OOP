package BubbleTea;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnAdd;
	private JButton btnSearch;
	private JButton btnShow;
	private JButton btnExit;
	@SuppressWarnings("deprecation")
	public void btnAdd_click() {
		AddGUI addgui=new AddGUI();
		addgui.show();
	}
	@SuppressWarnings("deprecation")
	public void btnShowAll_click() {
		CartGUI cartgui=new CartGUI();
		cartgui.show();
	}
	public MainGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAdd = new JButton("Start Order");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAdd_click();
			}
		});
		btnAdd.setBounds(153, 38, 117, 29);
		contentPane.add(btnAdd);
		
		
		btnShow = new JButton("View Cart");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnShowAll_click();
			}
		});
		btnShow.setBounds(153, 114, 117, 29);
		contentPane.add(btnShow);
		
	}
	
	
	
}
