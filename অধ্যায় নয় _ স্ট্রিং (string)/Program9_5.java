package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program9_5 {

	static int string_length(char str[]) {
		int length = 0;

		for (char c : str) {
			length++;
		}
		return length;
	}

	/*
	 * we can also use this 
	 * static int string_length(char str[]) { 
	 * int length = 0;
	 * 
	 * for (int i = 0; i < str.length; i++) { 
	 * length++; 
	 * } 
	 * 
	 * return length; 
	 * }
	 */
	
	/*
	 * we can also use this 
	 * static int string_length(char str[]) {
	 * int i;
	 * 
	 * for (i = 0; i < str.length; i++); 
	 * return i; 
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] country = new char[100];
		Scanner scan = new Scanner(System.in);
		String str;

		int length;

		str = scan.nextLine();
		scan.close();
		country = str.toCharArray();

		length = string_length(country);
		System.out.printf("length: %d\n", length);

	}

}
