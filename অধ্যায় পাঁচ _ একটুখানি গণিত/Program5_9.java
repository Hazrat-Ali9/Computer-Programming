package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, t, gcd;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();

		if (a == 0) {
			gcd = a;
		} else if (b == 0) {
			gcd = b;
		} else {
			while (b != 0) {
				t = b;
				b = a % b;
				a = t;
			}
			gcd = a;
		}
		System.out.printf("GCD is %d\n", gcd);

	}

}
