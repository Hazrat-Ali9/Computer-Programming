package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = new char[1];
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the first letter of your name: ");

		scan.next().getChars(0, 1, ch, 0);
		scan.close();

		System.out.printf("The first letter of your name is: %c\n", ch[0]);

	}

}
