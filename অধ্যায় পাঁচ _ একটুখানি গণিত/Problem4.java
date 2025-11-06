package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double time_passed, final_velocity, distance;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter final velocity (v): ");
		final_velocity = scan.nextDouble();

		System.out.printf("Enter time passed (t): ");
		time_passed = scan.nextDouble();
		scan.close();

		distance = 2 * time_passed * final_velocity;

		System.out.printf("Distance crossed in 2t: %.2f\n", distance);
	}

}
