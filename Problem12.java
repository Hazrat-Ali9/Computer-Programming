package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for (int i = 0; i < T; i++) {
			int n = input.nextInt();
			System.out.println(evenodd(n));
		}
		input.close();

	}

	public static String evenodd(int n) {
		String result = "";
		if (n % 2 == 0) {
			result = "even";
		} else if (n % 2 != 0) {
			result = "odd";
		}
		return result;
	}

}
