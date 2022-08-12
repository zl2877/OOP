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
	private JLabel lbl1;
	private JLabel lbl2;
	
	public WarningGUI(String message) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("WARNING!");
		lbl1.setForeground(Color.RED);
		lbl1.setBounds(178, 19, 102, 16);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel(message+" need to be set!");
		lbl2.setForeground(Color.RED);
		lbl2.setBounds(17, 67, 427, 117);
		contentPane.add(lbl2);
		
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
