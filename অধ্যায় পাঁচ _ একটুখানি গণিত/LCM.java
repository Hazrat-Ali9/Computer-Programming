package ComputerProgrammingPartOne;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, t, x, y, gcd;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();

		x = a;
		y = b;

		if (a == 0 && b == 0) {
			System.out.println("Undefined");
		} else if (a == 0) {
			gcd = a;
			System.out.println("Undefined");
		} else if (b == 0) {
			gcd = b;
			System.out.println("Undefined");
		} else {
			while (b != 0) {
				t = b;
				b = a % b;
				a = t;
			}
			gcd = a;
			System.out.printf("LCM is %d\n", (x * y) / gcd);
		}
	}

}
