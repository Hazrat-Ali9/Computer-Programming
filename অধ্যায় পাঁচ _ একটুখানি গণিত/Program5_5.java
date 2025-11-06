package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		scan.close();
		sum = (n * (n + 1)) / 2;

		System.out.printf("Summation is %d\n", sum);
	}
}
