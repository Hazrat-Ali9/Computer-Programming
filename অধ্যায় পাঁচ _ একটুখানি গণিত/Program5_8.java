package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, x, gcd = 0;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();

		if (a < b) {
			x = a;
		} else {
			x = b;
		}

		for (; x >= 1; x--) {
			if (a % x == 0 && b % x == 0) {
				gcd = x;
				break;
			}
		}
		System.out.printf("GCD is %d\n", gcd);
	}

}
