// text parsing into html

public class text {
	public static String par(String str){
		return "<p>" + str + "</p>\n";
	}
	
	public static String heading(String str){
		return "<h1>" + str + "</h1>\n";
	}
	
	public static String slide(String str){
		return "<section>\n" + str + "</section>\n";
	}
}
