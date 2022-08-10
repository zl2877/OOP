package BubbleTea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 

public class WarningGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton ok;
	
	public WarningGUI(String message) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WARNING!");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(178, 19, 102, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(message+" need to be set!");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(44, 112, 377, 16);
		contentPane.add(lblNewLabel_1);
		
		ok = new JButton("OK");
		ok.setBounds(148, 190, 117, 29);
		contentPane.add(ok);
		ok.addActionListener(this);
	
		
	}
	public void btnAdd_click() {
		AddGUI addgui=new AddGUI();
		addgui.show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ok) {
			
			dispose();
		}
		
	}
}
