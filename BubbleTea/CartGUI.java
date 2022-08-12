package BubbleTea;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;

public class CartGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblResults;
	private JLabel lblItems;
	private JButton btnClose;
	private JButton btnAdd;
	
	
		
	public void btnCheck_click(){
		FileManager.clear();
		FileManager.count=0;
		CheckGUI checkgui=new CheckGUI();
		checkgui.show();
		
	}
	public void btnAdd_click(){
		AddGUI addgui=new AddGUI();
		addgui.show();
		 
	}
	
	public void show_order() {
		FileManager filemanager=new FileManager();
		String result=filemanager.get_all();
		lblResults.setText(result);
	}
	public CartGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		lblResults = new JLabel("");
		lblResults.setVerticalAlignment(SwingConstants.TOP);
		lblResults.setBounds(22, 32, 390, 181);
		contentPane.add(lblResults);
		show_order();
		
		btnClose = new JButton("Check Out");
		btnClose.setForeground(new Color(250, 128, 114));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCheck_click();
			}
		});
		btnClose.setBounds(261, 237, 117, 29);
		contentPane.add(btnClose);
		
		btnAdd = new JButton("Add More");
		btnAdd.setForeground(new Color(250, 128, 114));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAdd_click();
			}
		});
		btnAdd.setBounds(84, 237, 117, 29);
		contentPane.add(btnAdd);
		
		JLabel lblItems = new JLabel("Your items:");
		lblItems.setForeground(new Color(255, 182, 193));
		lblItems.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblItems.setBounds(22, 16, 117, 16);
		contentPane.add(lblItems);
		
		
	}
}
