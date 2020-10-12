package Lab2;

public class geoSummation {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //Get start line of program
		int a = 1;
		int N = 3;
		geoSum(a, N);
		long end = System.currentTimeMillis(); //End time of program
		long runTime= end - start; //calculate duration
		double finalAnswer = geoSum(a,N); // Store Sum in a variable
		System.out.println("Sum: " + finalAnswer);
		System.out.println("Run Time: " + runTime); 
	}
	
	public static double geoSum(int a, int N) {
		double i;
		double sum = 0;
		
		for (i = 0; i <= N; i++) {
			sum = sum + Math.pow(a, i);
		}
		return sum; // returning will be better for the run time
	}
}

