package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem9 {

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
		Scanner scan = new Scanner(System.in);
		int[] primeCount;
		int N;
		String line;
		String[] numbersInALineStr;
		int[] numbersInALineStrInt;

		N = scan.nextInt();
		scan.nextLine();
		primeCount = new int[N];

		for (int i = 0; i < N; i++) {
			line = scan.nextLine();
			int individualPrimeCount = 0;

			numbersInALineStr = line.trim().split("\\s+");
			numbersInALineStrInt = new int[numbersInALineStr.length];

			for (int j = 0; j < numbersInALineStr.length; j++) {
				numbersInALineStrInt[j] = Integer.parseInt(numbersInALineStr[j]);
			}

			for (int number : numbersInALineStrInt) {
				while (number < 0 || number > 100) {
					line = scan.nextLine();

					numbersInALineStr = line.trim().split("\\s+");
					numbersInALineStrInt = new int[numbersInALineStr.length];

					for (int j = 0; j < numbersInALineStr.length; j++) {
						numbersInALineStrInt[j] = Integer.parseInt(numbersInALineStr[j]);
					}
				}
			}

			for (int j = 0; j < 10; j++) {
				if (is_prime(numbersInALineStrInt[j]) == 1) {
					individualPrimeCount++;
				}
			}

			primeCount[i] = individualPrimeCount;
		}
		scan.close();

		for (int i = 0; i < primeCount.length; i++) {
			System.out.printf("%d\n", primeCount[i]);
		}

	}

}
