package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem18 {

	public static String getColor(int number) {
		if ((number % 2) == 0) {
			return "blue";
		} else {
			return "red";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int today = 1, n;

		String[] answers;
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}

		answers = new String[T];

		for (int i = 0; i < T; i++) {
			n = input.nextInt();
			
			while (n < 0) {
				n = input.nextInt();			
			}

			answers[i] = getColor(today + n);
		}
		input.close();

		for (String answer : answers) {
			System.out.printf("%s\n", answer);
		}

	}

}
