package BubbleTea;

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
	private JComboBox Tea;
	
	private float price;
	private String teatype;
	private String toppingtype;
	private String sugar_level;
	private String ice_level;
	private String size_level;
	

	public void btnCart_click(){
		PriceCalculator p=new PriceCalculator();
		price=p.calculate(toppingtype,size_level);
		Tea cup=new Tea(teatype,toppingtype,sugar_level,ice_level,size_level,price);
		CartGUI cartgui=new CartGUI();
		cartgui.show();
		System.out.println(cup);
	}
	public AddGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel(" ");
		lblNewLabel_8.setBounds(126, 234, 61, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel = new JLabel("Classic Teas:");
		lblNewLabel.setForeground(new Color(51, 153, 51));
		lblNewLabel.setBounds(55, 75, 93, 21);
		contentPane.add(lblNewLabel);
		
		JComboBox Tea = new JComboBox();
		Tea.setBounds(212, 72, 186, 29);
		Tea.setForeground(UIManager.getColor("Button.select"));
		Tea.addItem("Jasmine Green Tea");
		Tea.addItem("Jasmine Grey Tea");
		Tea.addItem("Earl Grey Tea");
		Tea.addItem("Roasted Oolong Tea");
		Tea.addItem("Black Tea");
		Tea.addItem("Rose Tea");
		contentPane.add(Tea);
		
		Tea.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		       Object tt = Tea.getSelectedItem();
		              if (tt != null ) { 
		                 teatype=tt.toString();
		              } 
		      }
		  });

		
		JLabel lblNewLabel_1 = new JLabel("Welcome to our boba shop : )");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setBounds(126, 6, 204, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customize your boba tea with us:");
		lblNewLabel_2.setBounds(45, 47, 239, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Toppings:");
		lblNewLabel_3.setForeground(new Color(0, 153, 255));
		lblNewLabel_3.setBounds(55, 109, 84, 16);
		contentPane.add(lblNewLabel_3);
		
		JComboBox toppings = new JComboBox();
		toppings.setForeground(new Color(153, 51, 204));
		toppings.setBounds(212, 104, 186, 29);
		toppings.addItem("Boba");
		toppings.addItem("Strawberry Popping Boba");
		toppings.addItem("Mango Popping Boba");
		toppings.addItem("Lychee Popping Boba");
		toppings.addItem("Jelly");
		toppings.addItem("Herbal Jelly");
		toppings.addItem("Pudding");
		toppings.addItem("No topping");
		contentPane.add(toppings);
		
		toppings.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		       Object t = toppings.getSelectedItem();
		              if (t != null ) { 
		                 toppingtype=t.toString();
		              } 
		      }
		  });
		
		JComboBox sugar = new JComboBox();
		sugar.setForeground(new Color(0, 51, 255));
		sugar.setBounds(212, 139, 186, 21);
		sugar.addItem("No Suger");
		sugar.addItem("25% Suger");
		sugar.addItem("50% Suger");
		sugar.addItem("75% Suger");
		sugar.addItem("100% Suger");
		contentPane.add(sugar);
		
		sugar.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		       Object s = sugar.getSelectedItem();
		              if (s != null ) { 
		                 sugar_level=s.toString();
		              } 
		      }
		  });
		
		JLabel ice_select = new JLabel("Ice Level:");
		ice_select.setForeground(new Color(255, 153, 51));
		ice_select.setBounds(55, 165, 61, 16);
		contentPane.add(ice_select);
		
		
		JLabel lblNewLabel_4 = new JLabel("Suger Level:");
		lblNewLabel_4.setForeground(new Color(255, 0, 51));
		lblNewLabel_4.setBounds(55, 137, 100, 16);
		contentPane.add(lblNewLabel_4);
		
		JComboBox ice = new JComboBox();
		ice.setForeground(new Color(0, 51, 51));
		ice.setBounds(212, 163, 186, 29);
		ice.addItem("No Ice");
		ice.addItem("Less Ice");
		ice.addItem("Regular Ice");
		
		contentPane.add(ice);
		ice.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		       Object i = ice.getSelectedItem();
		              if (i != null ) { 
		                 ice_level=i.toString();
		              } 
		      }
		  });
		
		JComboBox size = new JComboBox();
		size.setForeground(new Color(51, 204, 204));
		size.setBounds(212, 191, 186, 28);
		size.addItem("Small");
		size.addItem("Regular");
		size.addItem("Large");
		contentPane.add(size);
		size.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		       Object s = size.getSelectedItem();
		              if (s != null ) { 
		                 size_level=s.toString();
		              } 
		      }
		  });
		
		JLabel lblNewLabel_6 = new JLabel("Size:");
		lblNewLabel_6.setForeground(new Color(204, 51, 102));
		lblNewLabel_6.setBounds(55, 193, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.setBounds(149, 229, 117, 29);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCart_click();
			}
		});
		

		
	

		
	}
}
