package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 25) {
			T = input.nextInt();
		}
		int[] allT = new int[T];

		for (int i = 0; i < T; i++) {
			int n = input.nextInt();
			while (n < 1 || n > 100) {
				n = input.nextInt();
			}
			allT[i] = n;
		}
		input.close();

		for (int i = 0; i < allT.length; i++) {
			drawSquare(allT[i]);
			System.out.println();
		}

	}

	public static void drawSquare(int number) {
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
