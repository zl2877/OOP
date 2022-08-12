package BubbleTea;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class CheckGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblthank;
	private JLabel lbltotal;
	private JLabel lblprice;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckGUI frame = new CheckGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public CheckGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltotal = new JLabel("Your total is:  ");
		lbltotal.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lbltotal.setForeground(new Color(250, 128, 114));
		lbltotal.setBounds(145, 122, 137, 16);
		contentPane.add(lbltotal);
		
		JLabel lblthank = new JLabel("Thank you for your purchase...");
		lblthank.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblthank.setForeground(new Color(255, 182, 193));
		lblthank.setBounds(83, 83, 277, 16);
		contentPane.add(lblthank);
		
		JLabel lblprice = new JLabel(" ");
		lblprice.setForeground(new Color(250, 128, 114));
		lblprice.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		lblprice.setBounds(246, 122, 61, 16);
		
		
		contentPane.add(lblprice);
		lblprice.setText(String.valueOf(AddGUI.total));
	}

}
