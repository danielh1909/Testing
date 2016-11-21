
public class Wuerfelspiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(triesUntilThreeOnes());
	}
	public static int triesUntilThreeOnes(){
		int counter =0;
		int ones = 0;
		
		while(ones < 3){
			int val = 1 + (int)(Math.random()*6);
			
			if(val == 1){
				ones++;
			}
			System.out.println("try = "+val);
			counter++;
		}
		System.out.println("ones: "+ones);
		return counter;
	}
	}