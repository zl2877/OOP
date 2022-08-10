package BubbleTea;
import java.io.*;
import java.util.Scanner;

public class FileManager {
	public static int count;
	//public File text = new File("bubbletea.txt");
	public void clear() {
		File file = new File("bubbletea.txt");
		if(file.exists()){
		    file.delete();
		}
	}
	
	public boolean save(Tea t) {
		boolean result;
		try {
			FileWriter fw=new FileWriter("bubbletea.txt",true);
			count++;
			fw.write("Item "+count+": ");
			fw.write(t.getTeaType()+"\n");
			fw.write("(Customize: +"+t.getTopping()+"/"+t.getSugar()+" /"+t.getIce()+" /"+t.getSize()+")"+"\n");
			fw.write("Price: "+t.getPrice()+"\n");
			fw.close();
			result=true;
		} catch (IOException e) {
			e.printStackTrace();
			result=false;
		}

		return result;
		
	}
	
	public String get_all() {
		Scanner scanner;
		String result = "<html><font color='green'font size='1.2'>";

		try {
			scanner = new Scanner(new File("bubbletea.txt"));
		while(scanner.hasNextLine())
			{
				result+= scanner.nextLine()+"<br/>";
				
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		result+="</font>"+"</html>";
		return result;
	}

}
