package ComputerProgrammingPartOne;

import java.io.IOException;
import java.util.Scanner;

public class Program2_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a, b, sum;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();

		sum = a + b;

		System.out.printf("Sum is: %d\n", sum);

	}

}
