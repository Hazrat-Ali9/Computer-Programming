package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1, a2, b1, b2, c1, c2, d, x, y;
		Scanner scan = new Scanner(System.in);

		System.out.printf("a1 = ");
		a1 = scan.nextDouble();

		System.out.printf("a2 = ");
		a2 = scan.nextDouble();

		System.out.printf("b1 = ");
		b1 = scan.nextDouble();

		System.out.printf("b2 = ");
		b2 = scan.nextDouble();

		System.out.printf("c1 = ");
		c1 = scan.nextDouble();

		System.out.printf("c2 = ");
		c2 = scan.nextDouble();
		scan.close();

		d = a1 * b2 - a2 * b1;

		if ((int) d == 0) {
			System.out.printf("Value of x and y can not be determined.\n");
		} else {
			x = (b2 * c1 - b1 * c2) / (a1 * b2 - a2 * b1);
			y = (a1 * c2 - a2 * c1) / (a1 * b2 - a2 * b1);

			System.out.printf("x = %.2f, y = %.2f\n", x, y);
		}
	}

}
