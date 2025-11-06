package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, value;
		char sign;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Please enter a number: ");
		num1 = scan.nextInt();

		System.out.printf("Please enter another number: ");
		num2 = scan.nextInt();

		scan.close();

		value = num1 + num2;
		sign = '+';
		System.out.printf("%d %c %d = %d\n", num1, sign, num2, value);

		value = num1 - num2;
		sign = '-';
		System.out.printf("%d %c %d = %d\n", num1, sign, num2, value);

		value = num1 * num2;
		sign = '*';
		System.out.printf("%d %c %d = %d\n", num1, sign, num2, value);

		value = num1 / num2;
		sign = '/';
		System.out.printf("%d %c %d = %d\n", num1, sign, num2, value);

	}

}
