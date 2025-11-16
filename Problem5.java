package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem5 {

	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];

		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];

		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] maxMin;
		int N;
		String line;
		String[] numbersInALineStr;
		int[] numbersInALineStrInt;

		N = scan.nextInt();
		scan.nextLine();
		maxMin = new int[N][2];

		for (int i = 0; i < N; i++) {
			line = scan.nextLine();

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

			maxMin[i][0] = getMax(numbersInALineStrInt);
			maxMin[i][1] = getMin(numbersInALineStrInt);
		}
		scan.close();

		for (int i = 0; i < maxMin.length; i++) {
			System.out.printf("%d %d\n", maxMin[i][0], maxMin[i][1]);
		}

	}

}
