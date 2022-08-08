import java.io.*;
import java.util.Scanner;

public class FileManager {
	public File text = new File("data.txt");
	/*
	public boolean save(Object t) {
		boolean result;
		
		try {
			FileWriter fw=new FileWriter(text,true);
			fw.write(t.toString());
			fw.close();
			result=true;
		} catch (IOException e) {
			e.printStackTrace();
			result=false;
		}
		return result;
	}
	*/
	public void WritetoFile() {
	    try {
	        FileWriter myWriter = new FileWriter(text);
	        myWriter.write("teatype topping sugar ice 5");
	        myWriter.write("teatype topping sugar ice 6");
	        myWriter.close();
	        System.out.println("wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	public String get_all() {
		Scanner scanner;
		String result="<html>";
		try {
			
			scanner = new Scanner(text);
			
			while(scanner.hasNextLine()) {
				result+=scanner.nextLine()+"<br>";
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		result+="</html>";
		return result;
	}
	public float calculateTotal(Object t){
		float finalAmount=0;
		Scanner scanner;
		try {
			scanner = new Scanner(text);
			while(scanner.hasNextLine()) {
				finalAmount+=scanner.nextFloat();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		return finalAmount;
		
	}
}
