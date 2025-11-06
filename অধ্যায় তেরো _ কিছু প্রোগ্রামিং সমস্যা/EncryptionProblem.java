package ComputerProgrammingPartOne;

import java.util.Scanner;

public class EncryptionProblem {

	public static void encrypt(char msg[]) {
		int i, n;

		n = msg.length;

		for (i = 0; i < n; i++) {
			if ((msg[i] >= 'a' && msg[i] <= 'z') || (msg[i] >= 'A' && msg[i] <= 'Z')) {
				if (msg[i] == 'z') {
					msg[i] = 'a';
				} else if (msg[i] == 'Z') {
					msg[i] = 'A';
				} else {
					msg[i] = (char) (msg[i] + 1);
				}
			}
		}
	}

	public static void decrypt(char msg[]) {
		int i, n;

		n = msg.length;

		for (i = 0; i < n; i++) {
			if ((msg[i] >= 'a' && msg[i] <= 'z') || (msg[i] >= 'A' && msg[i] <= 'Z')) {
				if (msg[i] == 'a') {
					msg[i] = 'z';
				} else if (msg[i] == 'A') {
					msg[i] = 'Z';
				} else {
					msg[i] = (char) (msg[i] - 1);
				}
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
		
		decrypt(s);

		System.out.printf("%s\n", String.valueOf(s));


	}

}
