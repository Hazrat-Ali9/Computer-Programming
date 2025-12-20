package ComputerProgrammingPartOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem16 {

	public static int getFactorial(int number) {
		int factorial = 1;

		if (number == 0 || number == 1) {
			return factorial;
		} else {
			for (int i = number; i >= 1; i--) {
				factorial = factorial * i;
			}
			return factorial;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String line;
		int lineLength;
		String[] lineInArray;
		String[] lines;

		int N = input.nextInt();

		while (N < 1) {
			N = input.nextInt();
		}

		lines = new String[N];

		for (int i = 0; i < N; i++) {
			line = input.nextLine();

			lineLength = line.trim().split("\\s+").length;
			lineInArray = line.trim().split("\\s+");

			boolean allFine = true;

			for (String word : lineInArray) {
				if (word.length() < 1 || word.length() > 20) {
					allFine = false;
					break;
				}
			}

			while (lineLength < 1 || lineLength > 10 || allFine == false) {
				line = input.nextLine();

				lineLength = line.trim().split("\\s+").length;
				lineInArray = line.trim().split("\\s+");

				allFine = true;

				for (String word : lineInArray) {
					if (word.length() < 1 || word.length() > 20) {
						allFine = false;
						break;
					}
				}

			}
			lines[i] = line;

		}
		input.close();

		for (int i = 0; i < lines.length; i++) {
			ArrayList<String> wordsList = new ArrayList<String>();
			lineInArray = lines[i].trim().split("\\s+");

			for (String word : lineInArray) {
				wordsList.add(word);
			}
			int denominator = 1;

			for (int j = 0; j < wordsList.size();) {

				int counter = 0;
				for (int j2 = 0; j2 < lineInArray.length; j2++) {
					if (wordsList.get(j).equals(lineInArray[j2])) {
						counter++;
					}
				}
				denominator = denominator * getFactorial(counter);
				wordsList.removeAll(Collections.singleton(wordsList.get(j)));
			}

			int n = getFactorial(lines[i].trim().split("\\s+").length) / denominator;
			System.out.printf("1/%d\n", n);
		}

	}

}
