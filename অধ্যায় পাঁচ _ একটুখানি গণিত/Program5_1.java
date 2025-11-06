package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y, x_plus_y, x_minus_y;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the value of x + y: ");
		x_plus_y = scan.nextDouble();

		System.out.printf("Enter the value of x - y:");
		x_minus_y = scan.nextDouble();
		scan.close();

		x = (x_plus_y + x_minus_y) / 2;
		y = (x_plus_y - x_minus_y) / 2;

		System.out.printf("x = %.2f, y = %.2f\n", x, y);

	}

}
