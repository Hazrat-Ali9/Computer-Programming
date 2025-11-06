package ComputerProgrammingPartOne;

public class Program11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] saarc = { "Bangladesh", "India", "Pakistan", "Sri Lanka", "Nepal", "Bhutan", "Maldives" };
		int row, col, name_length;

		for (row = 0; row < 7; row++) {
			name_length = saarc[row].length();
			
			for (col = 0; col < name_length; col++) {
				System.out.printf("%c\n", saarc[row].charAt(col));
			}
			
			System.out.printf("\n");
		}
	}

}
