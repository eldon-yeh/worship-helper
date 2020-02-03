import java.util.Scanner;
import java.io.*;

public class file {
	private String output = "";
	private String head;
	private String tail;
	
	public void initialize() {
		head = filetotext("head.html");
		System.out.println(head);
	}
	
	public void finalize() {
		output = head + output + tail;
		write();
	}
	
	public String filetotext(String fname) {
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
	
	public Scanner read(String fname){
		File file = new File(fname);
		Scanner s = null;
		try{
			s = new Scanner(file);
		}
		catch(Exception e){
			System.out.println("no");
		}
		return s;
	}
	
	public void print(Scanner x) {
		while (x.hasNext()) {
			System.out.println(x.next());
		}
	}
	
	
	public String process(Scanner x) {
		String temp = "";
		String next = "";
		while (x.hasNextLine()) {
			next = x.nextLine();
			
			if (next.isEmpty()) {
				output = output + "</section>\n<section>\n";
			}
			
			else {
				temp = text.par(next);
				output = output + temp;
			}
		}
		//System.out.println(output);
		output = output + "</section>";
		return output;
	}
	
	public void write() {
		try{
			FileWriter w = new FileWriter("output.txt");
			w.write(output);
			w.close();
		}
		catch (IOException e) {
			System.out.println("an error occured");
		}
	}
}
