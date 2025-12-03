package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] digitCount;
		int N, number;

		N = scan.nextInt();
		scan.nextLine();
		digitCount = new int[N];

		for (int i = 0; i < N; i++) {
			number = scan.nextInt();

			while (number < 0 || number > 10000001) {
				number = scan.nextInt();

			}
			
			digitCount[i] = Integer.toString(number).length();
		}
		scan.close();

		for (int i = 0; i < digitCount.length; i++) {
			System.out.printf("%d\n", digitCount[i]);
		}

	}

}
