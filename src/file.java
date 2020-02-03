// file operations
import java.util.Scanner;
import java.io.*;

public class file {
	private String output = "";
	private String head;
	private String tail;
	
	
	public void finalize() {
		output = head + output + tail;
	}
	
	public static String filetotext(String fname) {
		String s = null;
		try {
			Scanner scanner = new Scanner( new File(fname) );
			s = scanner.useDelimiter("\\A").next();
			scanner.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static Scanner read(String fname){
		File file = new File(fname);
		Scanner s = null;
		try{
			s = new Scanner(file);
		}
		catch(Exception e){
			System.out.println("an error occured");
		}
		return s;
	}
	
	public void print(Scanner x) {
		while (x.hasNext()) {
			System.out.println(x.next());
		}
	}
	
	
	public static void write(String str) {
	// writes string to output.txt
		try{
			FileWriter w = new FileWriter("output.html");
			w.write(str);
			w.close();
		}
		catch (IOException e) {
			System.out.println("an error occured");
		}
	}
}
