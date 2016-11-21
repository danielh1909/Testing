
public class Gehaltskonto {

	private String Inhaber;
	private String IBAN;
	private String BIC;
	private double Kontostand;
		
	
	
	public void setInhaber(String Inhaber){
		if(Inhaber==null){
			System.out.println("Inhaber verpflichtend!");
		}
		else
			this.Inhaber=Inhaber;
				Kontostand=0.0;
		}
	
	public void aufbuchen(double Betrag){
		Kontostand=Kontostand+Betrag;
		}
	
	public boolean abbuchen(double Betrag){
		Kontostand=Kontostand-Betrag;
		
		if(Kontostand - Betrag < 0){
			System.out.println("Diese Buchung ist nicht möglich, da ihr Kontostand dazu nicht ausreicht!");
			return false;
		}
		Kontostand=Kontostand-Betrag;
		return true;
		}
}
