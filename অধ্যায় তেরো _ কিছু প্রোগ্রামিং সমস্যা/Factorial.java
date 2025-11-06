package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, factorial = 1;
		Scanner scan = new Scanner(System.in);

		number = scan.nextInt();
		scan.close();

		if (number == 0 || number == 1) {
			System.out.printf("Factorial is %d\n", factorial);
		} else {
			for (int i = number; i >= 1; i--) {
				factorial = factorial * i;
			}
			System.out.printf("Factorial is %d\n", factorial);
		}
	}

}
