package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N, number, root;
		String[] answers;

		N = scan.nextInt();
		scan.nextLine();
		answers = new String[N];

		for (int i = 0; i < N; i++) {
			number = scan.nextInt();

			root = (int) Math.sqrt(number);

			if (Math.pow(root, 2) == number) {
				answers[i] = "YES";
			} else {
				answers[i] = "NO";
			}
		}
		scan.close();

		for (String string : answers) {
			System.out.printf("%s\n", string);
		}

	}

}
