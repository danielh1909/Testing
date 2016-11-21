
public class WinterreifenpflichtDemo {

	public static void main(String[] args) {
				
		boolean result = isWinterreifenPflicht (3, false);
		
		if(result){
			System.out.println("Bitte Winterreifen verwenden!");
		}
		else{
			System.out.println("Winterreifen sind nicht erforderlich!");
		}

	}
	public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
				
		
		if( (temperatur < 10 && rutschigeFahrbahn == true) 
				|| temperatur < 4){
			return true;}
			
			else {
			return false;
			}
		
	}
}
