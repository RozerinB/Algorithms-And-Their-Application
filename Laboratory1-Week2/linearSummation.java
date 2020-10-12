package Lab2;
public class linearSummation {

	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //Get start line of program
		int n = 15;
		LinearSum(n);
		long end = System.currentTimeMillis(); //End time of program
		long runTime= end - start; //calculate duration
		int finalAnswer = LinearSum(n);
		System.out.println("Sum: " + finalAnswer);
		System.out.println("Run Time: " + runTime); // print as a variable for a better run time
	}

	public static int LinearSum(int n) {

		int sum = 0;
		
		for (int i = 1; i<=n; i++) { 
			sum = sum + i ;
		}
		//sum = sum + (n-1) + 1; 
		return (sum); //  better run timee
	}
	/*
	 * Able to remove linear 15 by using i<= n
	 * However to use Linear Summation as per Linear Equation
	 * We should use sum = sum + (num-1) + 1
	 */
	
}

