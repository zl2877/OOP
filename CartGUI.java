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

public class CartGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblResults;
	private JButton btnClose;
	private JButton btnNewButton;
	
	public void btnCheck_click(){
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
		lblResults.setBounds(45, 29, 361, 144);
		contentPane.add(lblResults);
		
		btnClose = new JButton("Check Out");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCheck_click();
			}
		});
		btnClose.setBounds(258, 202, 117, 29);
		contentPane.add(btnClose);
		
		btnNewButton = new JButton("Add More");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAdd_click();
			}
		});
		btnNewButton.setBounds(106, 202, 117, 29);
		contentPane.add(btnNewButton);
	}

}
