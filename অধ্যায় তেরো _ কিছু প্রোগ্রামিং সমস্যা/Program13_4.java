package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program13_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		char c;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Please enter the initial position: ");
		x = scan.nextInt();
		y = scan.nextInt();

		while (true) {
			c = scan.next().charAt(0);

			if (c == 'S') {
				break;
			} else if (c == 'U') {
				x--;
			} else if (c == 'D') {
				x++;
			} else if (c == 'R') {
				y++;
			} else if (c == 'L') {
				y--;
			}
		}

		System.out.printf("Final position of the robot is: %d, %d\n", x, y);

	}

}
