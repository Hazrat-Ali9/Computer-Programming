package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] average;
		int N, sum;
		String line;
		String[] numbersInALineStr;
		int[] numbersInALineStrInt;

		N = scan.nextInt();
		scan.nextLine();
		average = new int[N];

		for (int i = 0; i < N; i++) {
			line = scan.nextLine();
			sum = 0;

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

			for (int j = 0; j < numbersInALineStrInt.length; j++) {
				sum = sum + numbersInALineStrInt[j];
			}

			average[i] = sum / 5;
		}
		scan.close();

		for (int i = 0; i < average.length; i++) {
			System.out.printf("%d\n", average[i]);
		}

	}

}
