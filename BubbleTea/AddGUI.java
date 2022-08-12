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
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AddGUI extends JFrame {

	private JPanel contentPane;
	private JComboBox CTea;
	private JComboBox toppings;
	private JComboBox sugar;
	private JComboBox ice;
	private JComboBox size;
	private JButton btnCart;
	private JLabel welcomemsg;
	private JLabel lbl1;
	private JLabel topmsg;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	public static float total;
	private Tea cup= new Tea("","","","","",0);


	public void btnCart_click(){
		
		try {
			
		Tea.cups.add(cup);
		FileManager filemanager=new FileManager();
		filemanager.save(cup);
		total+=cup.getPrice();
		
		CartGUI cartgui=new CartGUI();
		cartgui.show();
		}catch(Exception e) {
			System.out.println("Error dedected ");
		}
	}
	public void warn_click(String message) {
	
		WarningGUI warn = new WarningGUI(message);
		warn.show();
	}
	public AddGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomemsg = new JLabel("Customize your boba tea with us:");
		welcomemsg.setForeground(new Color(240, 128, 128));
		welcomemsg.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		welcomemsg.setBounds(55, 37, 258, 16);
		contentPane.add(welcomemsg);
		
		JLabel lbl1 = new JLabel("Classic Teas:");
		lbl1.setForeground(new Color(51, 153, 51));
		lbl1.setBounds(55, 75, 93, 21);
		contentPane.add(lbl1);
		
		this.CTea = new JComboBox();
		CTea.setBounds(212, 72, 186, 29);
		CTea.setForeground(UIManager.getColor("Button.select"));
		CTea.addItem("Please select");
		CTea.addItem("Jasmine Green Tea");
		CTea.addItem("Jasmine Grey Tea");
		CTea.addItem("Earl Grey Tea");
		CTea.addItem("Roasted Oolong Tea");
		CTea.addItem("Black Tea");
		CTea.addItem("Rose Tea");
		contentPane.add(CTea);
		
		CTea.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        Object tt = CTea.getSelectedItem();
		              if (tt != null ) { 
		                 //teatype=tt.toString();
		            	 cup.setTeaType(tt.toString());
		                 cup.setPrice(5);
		              } 
		      }
		  });
		

		
		JLabel topmsg = new JLabel("Topping:");
		topmsg.setForeground(new Color(0, 153, 255));
		topmsg.setBounds(55, 109, 84, 16);
		contentPane.add(topmsg);
		
		this.toppings = new JComboBox();
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
		                // toppingtype=t.toString();
		                 if (t.toString().equalsIgnoreCase("no topping")) {
		         			cup.setPrice(cup.getPrice());
		         			cup.setTopping(t.toString());
		         		}
		         		else {
		         			cup.setPrice(cup.getPrice()+1);
		         			cup.setTopping(t.toString());
		         		}
		         		
		               
		              }
		      }
		  });
		
		this.sugar = new JComboBox();
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
		            	  cup.setSugar(s.toString());
		              } 
		      }
		  });
		
		JLabel lbl2 = new JLabel("Ice Level:");
		lbl2.setForeground(new Color(255, 153, 51));
		lbl2.setBounds(55, 165, 61, 16);
		contentPane.add(lbl2);
		
		
		JLabel lbl3 = new JLabel("Suger Level:");
		lbl3.setForeground(new Color(255, 0, 51));
		lbl3.setBounds(55, 137, 100, 16);
		contentPane.add(lbl3);
		
		this.ice = new JComboBox();
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
		            	  cup.setIce(i.toString());
		              } 
		      }
		  });
		
		this.size = new JComboBox();
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
		        
		            	  cup.setSize(s.toString());
			         		if (s.toString().equalsIgnoreCase("Small size")) {
			         
			         			cup.setPrice(cup.getPrice());
			         			
			         		}
			         		else if (s.toString().equalsIgnoreCase("Regular size")) {
			         			cup.setPrice(cup.getPrice()+1);
			      
			         		
			         		}
			         		else if (s.toString().equalsIgnoreCase("Large size")) {
			         			cup.setPrice(cup.getPrice()+2);
		
			         		}
			         		
		              } 
		      }
		  });
		
		JLabel lbl4 = new JLabel("Size:");
		lbl4.setForeground(new Color(204, 51, 102));
		lbl4.setBounds(55, 193, 61, 16);
		contentPane.add(lbl4);
		
		JButton btnCart = new JButton("Add to cart");
		btnCart.setForeground(new Color(250, 128, 114));
		btnCart.setBounds(149, 229, 117, 29);
		contentPane.add(btnCart);
		
		
		
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> messages = new ArrayList<String>();
				if (cup.getTeaType()=="") {
					messages.add("Tea");
				}
				if (cup.getTopping()==""){
					messages.add("Topping");
				}
				if (cup.getSugar()=="") {
					messages.add("Suger Level");
				}
				if (cup.getIce()=="") {
					messages.add("Ice Level");
				}
				if (cup.getSize()=="") {
					messages.add("Size Level");
				}
				if(messages.size() != 0) {
					StringBuilder warn = new StringBuilder();
					int counter = messages.size();
					for(String message : messages) {
						warn.append(message);
						counter --;
						if(counter != 0)
							warn.append(", ");
					}
					
					warn_click(warn.toString());
				}else {
				
				btnCart_click();
			}
			}
		});
		
	}
}
