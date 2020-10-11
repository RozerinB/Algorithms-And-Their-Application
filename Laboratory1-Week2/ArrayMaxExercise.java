package Lab2;

public class ArrayMaxExercise {
	
	
	
	public static void main (String[] args ) {
		System.out.print(ArrayMax());
	}
	
	public static double ArrayMax(){
		double numbers[] = {1,2,3,4};
		double currentMax = numbers[0];
		double arrayMax;
		int i;
		
		for(i =1; i < numbers.length; i++) {
			if (numbers[i] > currentMax) { 
				currentMax = numbers[i];
			}
		}
		return currentMax;
		
		
		
	}
}
