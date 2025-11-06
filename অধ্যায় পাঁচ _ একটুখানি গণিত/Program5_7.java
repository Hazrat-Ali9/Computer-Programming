package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius, farenheit;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the temperature in celsius: ");

		celsius = scan.nextDouble();
		scan.close();

		farenheit = 1.8 * celsius + 32;

		System.out.printf("Temperature in farenheit is: %f\n", farenheit);

	}

}
