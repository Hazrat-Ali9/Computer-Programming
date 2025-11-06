package ComputerProgrammingPartOne;

import java.util.Scanner;

public class SumOfOddNumbersUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, sum;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		scan.close();

		for (i = 1, sum = 0; i <= n; i += 2) {
			sum = sum + i;
		}
		System.out.printf("Summation is %d\n", sum);

	}

}
