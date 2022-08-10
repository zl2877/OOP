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
import java.awt.Font;

public class AddGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JComboBox Tea;
	private JComboBox toppings;
	private JComboBox sugar;
	private JComboBox ice;
	private JComboBox size;
	
	private JButton btnCart;
	private float price;
	private String teatype;
	private String toppingtype;
	private String sugar_level;
	private String ice_level;
	private String size_level;
	public static float total;
	

	public void btnCart_click(){
		PriceCalculator p=new PriceCalculator();
		price=p.calculate(toppingtype,size_level);
		Tea cup=new Tea(teatype,toppingtype,sugar_level,ice_level,size_level,price);
		FileManager filemanager=new FileManager();
		filemanager.save(cup);
		total+=price;
		CartGUI cartgui=new CartGUI();
		cartgui.show();
		
	}
	public AddGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl2 = new JLabel("Classic Teas:");
		lbl2.setForeground(new Color(51, 153, 51));
		lbl2.setBounds(55, 75, 93, 21);
		contentPane.add(lbl2);
		
		JComboBox Tea = new JComboBox();
		Tea.setBounds(212, 72, 186, 29);
		Tea.setForeground(UIManager.getColor("Button.select"));
		Tea.addItem("Please select");
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
		
		JLabel lbl1 = new JLabel("Customize your boba tea with us:");
		lbl1.setForeground(new Color(240, 128, 128));
		lbl1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lbl1.setBounds(55, 37, 258, 16);
		contentPane.add(lbl1);
		
		JLabel lbl3 = new JLabel("Toppings:");
		lbl3.setForeground(new Color(0, 153, 255));
		lbl3.setBounds(55, 109, 84, 16);
		contentPane.add(lbl3);
		
		JComboBox toppings = new JComboBox();
		toppings.setForeground(new Color(153, 51, 204));
		toppings.setBounds(212, 104, 186, 29);
		toppings.addItem("Please select");
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
		sugar.addItem("Please select");
		sugar.addItem("No Sugar");
		sugar.addItem("25% Sugar");
		sugar.addItem("50% Sugar");
		sugar.addItem("75% Sugar");
		sugar.addItem("100% Sugar");
		contentPane.add(sugar);
		
		sugar.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		       Object s = sugar.getSelectedItem();
		              if (s != null ) { 
		                 sugar_level=s.toString();
		              } 
		      }
		  });
		
		JLabel lbl6 = new JLabel("Ice Level:");
		lbl6.setForeground(new Color(255, 153, 51));
		lbl6.setBounds(55, 165, 61, 16);
		contentPane.add(lbl6);
		
		
		JLabel lbl4 = new JLabel("Suger Level:");
		lbl4.setForeground(new Color(255, 0, 51));
		lbl4.setBounds(55, 137, 100, 16);
		contentPane.add(lbl4);
		
		JComboBox ice = new JComboBox();
		ice.setForeground(new Color(0, 51, 51));
		ice.setBounds(212, 163, 186, 29);
		ice.addItem("Please select");
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
		size.addItem("Please select");
		size.addItem("Small size");
		size.addItem("Regular size");
		size.addItem("Large size");
		contentPane.add(size);
		size.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		       Object s = size.getSelectedItem();
		              if (s != null ) { 
		                 size_level=s.toString();
		              } 
		      }
		  });
		
		JLabel lbl5 = new JLabel("Size:");
		lbl5.setForeground(new Color(204, 51, 102));
		lbl5.setBounds(55, 193, 61, 16);
		contentPane.add(lbl5);
		
		JButton btnCart = new JButton("Add to cart");
		btnCart.setForeground(new Color(250, 128, 114));
		btnCart.setBounds(149, 229, 117, 29);
		contentPane.add(btnCart);
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCart_click();
			}
		});
		

		
	

		
	}
}
