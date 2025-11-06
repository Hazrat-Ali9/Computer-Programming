package ComputerProgrammingPartOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToBinaryWayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the decimal number: ");
		decimal = scan.nextInt();
		scan.close();

		System.out.printf("Binary value is %s\n", decimalToBinary(decimal));

	}

	public static String decimalToBinary(int decimal) {
		ArrayList<String> binaryList = new ArrayList<String>();

		int quotient = (int) (decimal / 2);
		int remainder = decimal % 2;

		while (quotient != 0) {
			binaryList.add(String.valueOf(remainder));
			decimal = quotient;
			quotient = (int) (decimal / 2);
			remainder = decimal % 2;
		}
		binaryList.add(String.valueOf(decimal % 2));

		Collections.reverse(binaryList);
		return String.join("", binaryList);
	}

}
