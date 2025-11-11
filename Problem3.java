package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] volume;
		int N;
		String line;
		String[] numbersInALineStr;
		int[] numbersInALineStrInt;

		N = scan.nextInt();
		scan.nextLine();
		volume = new int[N];

		for (int i = 0; i < N; i++) {
			line = scan.nextLine();
			int volumeIndividual = 1;

			numbersInALineStr = line.trim().split("\\s+");
			numbersInALineStrInt = new int[numbersInALineStr.length];

			for (int j = 0; j < numbersInALineStr.length; j++) {
				numbersInALineStrInt[j] = Integer.parseInt(numbersInALineStr[j]);
			}

			for (int number : numbersInALineStrInt) {
				while (number < 1 || number > 100) {
					line = scan.nextLine();

					numbersInALineStr = line.trim().split("\\s+");
					numbersInALineStrInt = new int[numbersInALineStr.length];

					for (int j = 0; j < numbersInALineStr.length; j++) {
						numbersInALineStrInt[j] = Integer.parseInt(numbersInALineStr[j]);
					}
				}
			}

			for (int j = 0; j < 3; j++) {
				volumeIndividual = volumeIndividual * numbersInALineStrInt[j];
			}

			volume[i] = volumeIndividual;
		}
		scan.close();

		for (int number : volume) {
			System.out.printf("%d\n", number);
		}

	}

}
