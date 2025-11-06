package ComputerProgrammingPartOne;

import java.util.Scanner;

public class DecimalToBinaryWayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal, n = 0, j = 0, sum = 0;
		char[] binaryArray;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the decimal number: ");
		decimal = scan.nextInt();
		scan.close();

		while (Math.pow(2, n) <= decimal) {
			n++;
		}

		binaryArray = new char[n];

		for (int i = n - 1; i >= 0; i--) {
			if ((Math.pow(2, i) + sum) <= decimal) {
				sum = (int) (sum + Math.pow(2, i));
				binaryArray[j] = '1';
				j++;
			} else {
				binaryArray[j] = '0';
				j++;
			}
		}

		System.out.printf("Binary value is %s\n", String.valueOf(binaryArray));
	}

}
