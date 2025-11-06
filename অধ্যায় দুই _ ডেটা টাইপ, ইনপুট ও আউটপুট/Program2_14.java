package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Please enter a number: ");
		num1 = scan.nextInt();

		System.out.printf("Please enter another number: ");
		num2 = scan.nextInt();

		scan.close();

		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);

	}

}
