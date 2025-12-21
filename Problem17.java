package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] amounts;
		int N, wordCount;
		String advert;

		N = scan.nextInt();
		while (N < 1) {
			N = scan.nextInt();
		}
		scan.nextLine();

		amounts = new int[N];

		for (int i = 0; i < amounts.length; i++) {
			advert = scan.nextLine();

			wordCount = advert.trim().split("\\s+").length;

			while (wordCount < 1 || wordCount > 1000) {
				advert = scan.nextLine();

				wordCount = advert.trim().split("\\s+").length;
			}

			amounts[i] = wordCount * 420;
		}
		scan.close();
		
		for (int amount : amounts) {
			System.out.printf("%d\n", amount);
		}

	}

}
