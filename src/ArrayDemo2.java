
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]monate = new String[12];
		monate[0]= "Jänner";
		monate[1]= "Februar";
		monate[2]= "März";
		monate[3]= "April";
		monate[4]= "Mai";
		monate[5]= "Juni";
		monate[6]= "Juli";
		monate[7]= "August";
		monate[8]= "September";
		monate[9]= "Oktober";
		monate[10]= "November";
		monate[11]= "Dezember";
		
		for(int m = 0; m < monate.length ; m++){
			
			System.out.println(monate[m] + " " + "[" + (m + 1) + "]");
		}
				
	}

}
