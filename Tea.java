package BubbleTea;

import java.util.ArrayList;


public class Tea {
	
    String teaType;
	String topping;
	String sugar;
	String ice;
	String size;
	float price;

	
	//constructor
	public Tea(String tType, String t, String s, String i, String si, float p) {
		teaType = tType;
		topping = t;
		sugar =s;
		ice=i;
		size=si;
		price=p;
		
	}
	
	//getters and setters
	public String getTeaType() {
		return teaType;
	}

	public void setTeaType(String teaType) {
		this.teaType = teaType;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	public String getIce() {
		return sugar;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	//return string representation
	public String toString() {
		
		return teaType+ "\t"+ topping + "\t" + sugar + "\t" + ice +"\t"+size+"\t"+price;
	}

	


}