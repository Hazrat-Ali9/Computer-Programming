package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numberCount, negativeCount = 0, positiveCount = 0;
		int[] n;

		numberCount = scan.nextInt();
		n = new int[numberCount];

		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < n.length; i++) {
			if (n[i] < 0) {
				negativeCount++;
			} else {
				positiveCount++;
			}
		}

		System.out.printf("%d %d", positiveCount, negativeCount);
	}

}
