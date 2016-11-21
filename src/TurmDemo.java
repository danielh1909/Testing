
public class TurmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl = 2;
		int m = 2;
				

		while(m<=9){
		System.out.println(zahl + " * " + m + " = " + (zahl*m));
		zahl *= m;
		m++;}
		
		m=2;
				
		while(m<=9){
		System.out.println(zahl + " / " + m + " = " + (zahl/m));
		zahl /= m;
		m++;}
				
	}
		
}
