package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word, reverse_word;
		char[] reverse_array;
		int i, j, len;
		Scanner scan = new Scanner(System.in);

		word = scan.next();
		scan.close();

		len = word.length();
		reverse_array = new char[len];

		for (i = 0, j = len - 1; i < len; i++, j--) {
			reverse_array[i] = word.charAt(j);
		}

		reverse_word = String.valueOf(reverse_array);

		System.out.printf("%s\n", reverse_word);

		if (0 == word.compareTo(reverse_word)) {
			System.out.printf("%s is a palindrome.\n", word);
		} else {
			System.out.printf("%s is not a palindrome.\n", word);
		}

	}

}
