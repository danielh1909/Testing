
public class TeilerFinden {

	public static void main(String[] args) {
		
		int zahl = 20;
		int teiler = 2;
		
		while(teiler < zahl) {
			
			if(zahl % teiler == 0) {
				System.out.println("teiler "+ teiler + " gefunden");
			}
			
			teiler++;
		}
		
	}
	
}