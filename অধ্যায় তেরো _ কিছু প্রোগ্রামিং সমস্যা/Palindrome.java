package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		int i, j, len;
		boolean isPalindrome = false;
		Scanner scan = new Scanner(System.in);

		word = scan.next();
		scan.close();

		len = word.length();
		j = len - 1;

		for (i = 0; i < len; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				isPalindrome = false;
				System.out.printf("%s is not a palindrome.\n", word);
				break;
			} else {
				isPalindrome = true;
			}
			if (i == j) {
				break;
			}
		}

		if (isPalindrome) {
			System.out.printf("%s is a palindrome.\n", word);
		}

	}

}
