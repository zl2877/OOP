package BubbleTea;

public class PriceCalculator {
	  	public String topping;
	    public String size;
		public float toppingPrice;
		public float sizePrice;
		public float totalPrice;
		

		public float calculate(String topping, String size) {
			
			totalPrice = 5;
			if (topping.equalsIgnoreCase("no topping")) {
				totalPrice+=0;
			}
			else {
				totalPrice+=1;
			}
			
			if (size.equalsIgnoreCase("small")) {
				totalPrice+=0;
			}
			else if (size.equalsIgnoreCase("regular")) {
				totalPrice+=1;
			}
			else if (size.equalsIgnoreCase("large")) {
				totalPrice+=2;
			}
			return totalPrice;
		}
		
	}
