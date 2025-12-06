package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Problem11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] inputs = new String[T];

		for (int i = 0; i < inputs.length; i++) {
			String temp = input.nextLine();
			int length = temp.length();
			while (length > 50 || !isDigit(temp.charAt(0)) || !isDigit(temp.charAt(temp.length() - 1))
					|| !isValid(temp)) {
				temp = input.nextLine();
				length = temp.length();
			}
			inputs[i] = temp;
		}
		input.close();

		for (int i = 0; i < inputs.length; i++) {
			StringBuilder myString = new StringBuilder(inputs[i]);

			for (int j = 1; j < myString.length() - 1; j++) {
				if (myString.charAt(j) == 'R') {

					myString.setCharAt(j, myString.charAt(j + 1));
				} else if (myString.charAt(j) == 'L') {
					myString.setCharAt(j, myString.charAt(j - 1));
				}
			}
			System.out.println(myString);
		}

	}

	static boolean isDigit(char m) {
		if (m >= 48 && m <= 57) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isValid(String s) {
		boolean res = true;
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'R' || s.charAt(i) == 'L') {
				if (isDigit(s.charAt(i - 1)) && isDigit(s.charAt(i + 1))) {
					res = true;
				} else {
					res = false;
					return res;
				}
			}
		}
		return res;
	}

}
