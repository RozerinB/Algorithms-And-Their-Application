package Lab2;

public class ArrayMinExercise {
	

	public static void main (String[] args ) {
		System.out.print(ArrayMin());
	}
	
	public static double ArrayMin(){
		double numbers[] = {1,2,3,4};
		double currentMin = numbers[0];
		double arrayMin;
		int i;
		
		for(i =1; i < numbers.length; i++) {
			if (numbers[i] < currentMin) { 
				currentMin = numbers[i];
			}
		}
		return currentMin;
		
		
		
	}
}

