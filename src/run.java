// run this

import java.util.Scanner;

public class run {
	public static void main(String[] args) {
		int iterations = 0;
		int counter = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of songs");
		iterations = s.nextInt();
		presentation p = new presentation();
		p.initialize();
		
		String currentsong = null;
	
		while (counter < iterations + 1) {
			System.out.println("enter filename for song " + counter + " (leave out .txt)");
			currentsong = s.next();
			p.addsong(currentsong);
			counter = counter + 1;
		}
		s.close();
		p.write();
		System.out.println("output.html created");
	}
}
