package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the first letter of your name: ");

		ch = scan.next().charAt(0);
		scan.close();

		System.out.printf("The first letter of your name is: %c\n", ch);

	}

}
