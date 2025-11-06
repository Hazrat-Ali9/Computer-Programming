package ComputerProgrammingPartOne;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius, farenheit;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the temperature in farenheit: ");

		farenheit = scan.nextDouble();
		scan.close();

		celsius = (farenheit - 32) / 1.8;

		System.out.printf("Temperature in celsius is: %f\n", celsius);
	}

}
