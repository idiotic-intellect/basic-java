package basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of lines");
		int n = sc.nextInt(), maxVal;
		maxVal = (n * (n + 1)) / 2;
		for (int i = n; i > 0; i--, n--) {
			maxVal = maxVal - n;
			for (int j = 1; j <= n; j++)
				System.out.print((maxVal + j) + " ");
			System.out.println();
		}

		sc.close();
		
		String mm="A2ML30051";
		System.out.println(mm.toLowerCase());
		
	}

}
