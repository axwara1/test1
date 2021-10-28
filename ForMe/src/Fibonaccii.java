import java.util.Scanner;

public class Fibonaccii {
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter number up to which Fibonacci series to print:");
		@SuppressWarnings("resource")
		int number1 = new Scanner(System.in).nextInt();
		
		for (int i = 1 ; i<=number1 ; i++) {
			System.out.print(fib(i) + " ");
		}
	}

	private static int  fib(int num) {
		
		if ( num == 1 || num == 2 )
			return 1 ;
		
		return ( fib(num-1)+fib(num-2));
		
	}

}
