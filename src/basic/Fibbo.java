package basic;

public class Fibbo {

	public static void main(String[] args) {
		System.out.println("Sum of n " + soNum(5));
		System.out.println("Multiple of n " + fact(5));
		System.out.print("Fibonacci Series ");
		fibonacci(0, 1, 10);
		System.out.println();
		System.out.println("Find Fibo number " + findFibo(6));
	}
	
	static int soNum(int n) {
		if(n == 0)
			return 0;
		else
			return n + soNum(n-1);
	}
	
	static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n * fact(n-1);
	}
	
	static void fibonacci(int a1, int a2, int count) {
		System.out.print(a1);
		int c = a1 + a2;
		if(count == 0) {
			System.out.print(".");
			return;
		}
		else {
			System.out.print(", ");
			fibonacci(a2, c, --count);
		}
	}
	
	static int findFibo(int n) {
		if(n <= 1)
			return n;
		else
			return findFibo(n-1) + findFibo(n-2);
	}

}
