package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program10_2 {

	// smartest

	static int is_prime(int n) {
		int i, root;

		if (n < 2) {
			return 0;
		}

		if (n == 2) {
			return 1;
		}

		if (n % 2 == 0) {
			return 0;
		}

		root = (int) Math.sqrt(n);

		for (i = 3; i <= root; i += 2) {
			if (n % i == 0) {
				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.printf("Please enter a number (enter 0 to exit): ");
			n = scan.nextInt();

			if (n == 0) {
				break;
			}

			if (1 == is_prime(n)) {
				System.out.printf("%d is a prime number.\n", n);
			} else {
				System.out.printf("%d is not a prime number.\n", n);
			}
		}

		scan.close();
	}

}
