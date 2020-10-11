package Lab2;
public class linearSummation {

	public static void main(String args[]) {
		int n = 10;
		LinearSum(n);
	}

	public static void LinearSum(int n) {

		int sum = 0;
		
		for (int i = 1; i<=n; i++) { 
			sum = sum + i ;
		}
		//sum = sum + (n-1) + 1; 
		
		System.out.println(sum);
	}
	/*
	 * Able to remove linear 15 by using i<= n
	 * However to use Linear Summation as per Linear Equation
	 * We should use sum = sum + (num-1) + 1
	 */
	
}

