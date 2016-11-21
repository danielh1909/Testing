public class ArrayDemoUebungsabend {

	public static void main(String[] args) {
		int[] numbers = {7,8,12,13,27};
		
		System.out.println(containsNumber(numbers,3));
		System.out.println(containsNumber(numbers,2));
		System.out.println(containsNumber(numbers,5));
		System.out.println(containsNumber(numbers,6));
		
		System.out.println("sum: " + calculateSum(numbers));
		printArray(numbers);
		printArray(reverse(numbers));
	}
		
	public static boolean containsNumber(int[] arr, int num) {	
		for(int i = 0; i < arr.length; i++) {
				if(arr[i] == num) {
					return true;
		}
	}	
					return false;
			
	}
	public static int calculateSum(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
				return sum;
	
	}
	
	public static void printArray (int[] arr){
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public static int[] reverse(int orig[]){
		int[] result = new int [orig.length];
		//int j = orig.length-1; mit Hilfsvariabler
		
		for(int i = 0; i < orig.length; i++) {
			//result[j] = orig[i]; mit Hilfsvariabler
			result[orig.length-1-i] = orig[i];
			//j--; mit Hilfsvariabler
			
		}
		return result;
	}
}


