package ComputerProgrammingPartOne;

public class Program9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char country[] = { 'B', 'a', 'n', 'g', 'l', 'a', 'd', 'e', 's', 'h' };
		int i, length;
		String str = new String(country);

		System.out.printf("%s\n", str);

		length = 10;

		for (i = 0; i < length; i++) {
			if (country[i] >= 97 && country[i] <= 122) {
				country[i] = (char) ('A' + (country[i] - 'a'));
			}
		}
		
		str = new String(country);
		System.out.printf("%s\n", str);
	}

}
