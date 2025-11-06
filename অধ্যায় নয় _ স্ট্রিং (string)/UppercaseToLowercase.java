package ComputerProgrammingPartOne;

public class UppercaseToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char country[] = { 'B', 'a', 'n', 'G', 'l', 'a', 'd', 'E', 's', 'H' };
		int i, length;
		String str = new String(country);

		System.out.printf("%s\n", str);

		length = 10;

		for (i = 0; i < length; i++) {
			if (country[i] >= 65 && country[i] <= 90) {
				country[i] = (char) ('a' + (country[i] - 'A'));
			}
		}

		str = new String(country);
		System.out.printf("%s\n", str);

	}

}
