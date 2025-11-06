package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String binary;
		int len, decimal, power, i;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the binary number: ");
		binary = scan.next();

		decimal = 0;
		len = binary.length();
		power = len - 1;

		for (i = 0; i < len; i++) {
			decimal += (binary.charAt(i) - '0') * Math.pow(2, power);
			power--;
		}

		System.out.printf("Decimal value is %d\n", decimal);
	}

}
