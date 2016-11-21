
public class Programmieren3EH {

	public static void main(String[] args) {
		String result = printRectangleArea("Das Rechteck hat Fläche von:", 6, 5);
		System.out.println(result);
		
	}
	public static String printRectangleArea(String text, int a, int b){
		int area = a * b;
		return text+" "+area;
		
	}
	
	}

