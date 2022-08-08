

import java.util.ArrayList;
import java.util.Collections;


public class cart {

	
		public void AddTea(ArrayList<Tea>cart1 , String tType, String t, String s, String i, String si, float p) {

				Tea newTea = new Tea(tType, t, s, i, si, p);
				cart1.add(newTea);
				System.out.println("Tea added.");
				
		}
}
