package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program13_7 {

	public static void encrypt(char msg[]) {
		int i, n;

		n = msg.length;

		for (i = 0; i < n; i++) {
			if (msg[i] >= 'a' && msg[i] <= 'z') {
				msg[i] = (char) (msg[i] + 1);
			} else if (msg[i] >= 'A' && msg[i] <= 'Z') {
				msg[i] = (char) (msg[i] + 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s;
		Scanner scan = new Scanner(System.in);

		s = scan.nextLine().toCharArray();
		scan.close();

		encrypt(s);

		System.out.printf("%s\n", String.valueOf(s));

	}

}
