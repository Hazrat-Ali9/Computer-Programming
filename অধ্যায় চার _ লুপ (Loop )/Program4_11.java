package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m, i, j;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		for (i = 0; i < n; i++) {
			m = scan.nextInt();

			for (j = 10; j <= m; j++) {
				if (j % 11 == 0) {
					continue;
				}

				System.out.printf("%d\n", j);
			}
		}
		scan.close();
	}

}
