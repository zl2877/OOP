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

public class AddGUI extends JFrame {

	private JPanel contentPane;
	private JLabel welcome;
	
	public AddGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(319, 71, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Classic Teas:");
		lblNewLabel.setForeground(new Color(51, 153, 51));
		lblNewLabel.setBounds(16, 75, 93, 21);
		contentPane.add(lblNewLabel);
		
		JComboBox TeaSelect = new JComboBox();
		TeaSelect.setBounds(121, 71, 186, 29);
		TeaSelect.setForeground(UIManager.getColor("Button.select"));
		TeaSelect.addItem("Jasmine Green Tea");
		TeaSelect.addItem("Jasmine Grey Tea");
		TeaSelect.addItem("Earl Grey Tea");
		TeaSelect.addItem("Roasted Oolong Tea");
		TeaSelect.addItem("Black Tea");
		TeaSelect.addItem("Rose Tea");
		contentPane.add(TeaSelect);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to our boba shop : )");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setBounds(126, 6, 204, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customize your boba tea with us:");
		lblNewLabel_2.setBounds(6, 47, 239, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Toppings:");
		lblNewLabel_3.setForeground(new Color(0, 153, 255));
		lblNewLabel_3.setBounds(16, 109, 84, 16);
		contentPane.add(lblNewLabel_3);
		
		JComboBox BobaSelect = new JComboBox();
		BobaSelect.setForeground(new Color(153, 51, 204));
		BobaSelect.setBounds(121, 104, 186, 29);
		BobaSelect.addItem("Boba");
		BobaSelect.addItem("Strawberry Popping Boba");
		BobaSelect.addItem("Mango Popping Boba");
		BobaSelect.addItem("Lychee Popping Boba");
		BobaSelect.addItem("Jelly");
		BobaSelect.addItem("Herbal Jelly");
		BobaSelect.addItem("Pudding");
		BobaSelect.addItem("No topping");
		contentPane.add(BobaSelect);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(319, 104, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Suger Level:");
		lblNewLabel_4.setForeground(new Color(255, 0, 51));
		lblNewLabel_4.setBounds(16, 140, 100, 16);
		contentPane.add(lblNewLabel_4);
		
		JComboBox SugerSelect = new JComboBox();
		SugerSelect.setForeground(new Color(0, 51, 255));
		SugerSelect.setBounds(121, 139, 186, 21);
		SugerSelect.addItem("No Suger");
		SugerSelect.addItem("25% Suger");
		SugerSelect.addItem("50% Suger");
		SugerSelect.addItem("75% Suger");
		SugerSelect.addItem("100% Suger");
		contentPane.add(SugerSelect);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBounds(319, 135, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Ice Level:");
		lblNewLabel_5.setForeground(new Color(255, 153, 51));
		lblNewLabel_5.setBounds(16, 168, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JComboBox IceSelect = new JComboBox();
		IceSelect.setForeground(new Color(0, 51, 51));
		IceSelect.setBounds(121, 163, 186, 29);
		IceSelect.addItem("No Ice");
		IceSelect.addItem("Less Ice");
		IceSelect.addItem("Regular Ice");
		
		contentPane.add(IceSelect);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(319, 163, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Save");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(319, 193, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JComboBox SizeSelect = new JComboBox();
		SizeSelect.setForeground(new Color(51, 204, 204));
		SizeSelect.setBounds(121, 194, 186, 28);
		SizeSelect.addItem("Small");
		SizeSelect.addItem("Regular");
		SizeSelect.addItem("Large");
		contentPane.add(SizeSelect);
		
		JLabel lblNewLabel_6 = new JLabel("Size:");
		lblNewLabel_6.setForeground(new Color(204, 51, 102));
		lblNewLabel_6.setBounds(16, 196, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Price:");
		lblNewLabel_7.setBounds(16, 234, 61, 16);
		contentPane.add(lblNewLabel_7);
		
		
	}
}
