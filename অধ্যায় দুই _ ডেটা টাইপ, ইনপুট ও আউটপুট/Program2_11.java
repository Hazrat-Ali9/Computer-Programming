package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, sum;
		Scanner scan = new Scanner(System.in);

		a = scan.nextDouble();
		b = scan.nextDouble();
		scan.close();

		sum = a + b;

		System.out.printf("Sum is: %f\n", sum);
	}

}
