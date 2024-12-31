package basic;

import java.util.Scanner;


public class Tower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt(),printSpaces;
		printSpaces = 2 * num - 1;
		for(int i = num; i > 0; i--) {
			boolean status = false;
			int init = 0;
			for(int j = 0; j < printSpaces; j++) {
				if(status == false) {
					init++;
				} else {
					init--;
				}
				if(init > num) {
					init -= 2;
					status = true;
				}
				if (init <= i) {
					System.out.print(init + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
