import java.io.File;


public class testing {
	public static void main(String[] args){
		System.out.println(new File(".").getAbsolutePath());
		presentation p = new presentation();
		p.initialize();
		p.addsong("test.txt");
		p.write();
	}
}
