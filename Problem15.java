package ComputerProgrammingPartOne;

import java.util.Arrays;
import java.util.Scanner;

public class Problem15 {

	public static String removeDuplicateElements(int[] arrayWithDuplicates) {
		int size = arrayWithDuplicates.length;
		String result = "";

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
					arrayWithDuplicates[j] = arrayWithDuplicates[size - 1];
					size--;
					j--;
				}
			}
		}

		int[] arrayWithNoDuplicates = Arrays.copyOf(arrayWithDuplicates, size);

		for (int i = 0; i < arrayWithNoDuplicates.length; i++) {
			result = result + String.valueOf(arrayWithNoDuplicates[i]);
		}

		return result;
	}

	static String getDistinct(int arr[], int n) {
		Arrays.sort(arr);
		String res = "";

		for (int i = 0; i < n; i++) {
			while (i < n - 1 && arr[i] == arr[i + 1])
				i++;

			res = res + Integer.toString(arr[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNumber, secondNumber;
		String firstNumberStr, secondNumberStr;
		String[] results;
		String result;

		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		results = new String[T];

		for (int i = 0; i < T; i++) {
			firstNumber = input.nextInt();

			while (Integer.toString(firstNumber).length() != 2) {
				firstNumber = input.nextInt();
			}

			secondNumber = input.nextInt();

			while (Integer.toString(secondNumber).length() != 2) {
				secondNumber = input.nextInt();
			}

			firstNumberStr = Integer.toString(firstNumber);
			secondNumberStr = Integer.toString(secondNumber);

			result = "";

			for (int j = 0; j < firstNumberStr.length(); j++) {
				for (int j2 = 0; j2 < secondNumberStr.length(); j2++) {
					if (firstNumberStr.charAt(j) == secondNumberStr.charAt(j2)) {
						result = result + firstNumberStr.charAt(j);
						break;
					}
				}
			}
			if (result == "") {
				results[i] = "N";
			} else {
				char[] a = result.toCharArray();
				Arrays.sort(a);
				int[] aInteger = new int[a.length];

				for (int j = 0; j < a.length; j++) {
					aInteger[j] = Integer.parseInt(String.valueOf(a[j]));
				}

				results[i] = removeDuplicateElements(aInteger);
			}

		}
		input.close();

		for (String res : results) {
			System.out.printf("%s\n", res);
		}

	}

}
