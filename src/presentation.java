// presentation class, supports adding slides from a text file
import java.util.Scanner;

public class presentation {
	private String head = "";
	private String tail = "";
	private String slides = "";
	
	public void initialize() {
		head = file.filetotext("head.html");
		tail = file.filetotext("tail.html");
	}
	
	public String output() {
		// final output of presentation structure
		return head + slides + tail;
	}
	
	public void write() {
		String out = output();
		file.write(out);
	}
	
	public String addsong(String fname) {
		// adds slides to presentation from a text file
		Scanner x;
		x = file.read("songs/"+ fname + ".txt");
		String temp = "";
		String next = "";
		// adding the title slide
		slides = slides + "<section>\n";
		next = x.nextLine();
		slides = slides + text.heading(next);
		
		// adding the rest of slides
		while (x.hasNextLine()) {
			next = x.nextLine();
			
			if (next.isEmpty()) {
				slides = slides + "</section>\n<section>\n";
			}
			
			else {
				temp = text.par(next);
				slides = slides + temp;
			}
		}
		slides = slides + "</section>\n";
		return slides;
	}
}
