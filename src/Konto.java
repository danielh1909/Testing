
public class Konto {
	private String kontoInhaber;
	private int kontost;
	
	public void setInhaber(String inhaber){
		
		kontoInhaber=inhaber;
		kontost=0;
		}
	
	public void aufbuchen(int Betrag){
		kontost=kontost+Betrag;
		}
	
	public boolean abbuchen(int Betrag){
		kontost=kontost-Betrag;
		
		if(kontost - Betrag < 0){
			System.out.println("Diese Buchung ist nicht möglich, da ihr Kontostand dazu nicht ausreicht!");
			return false;
		}
		kontost=kontost-Betrag;
		return true;
		}

}
