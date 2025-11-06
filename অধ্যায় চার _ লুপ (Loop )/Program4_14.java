package ComputerProgrammingPartOne;

public class Program4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;

		for (a = 1; a <= 3; a++) {
			for (b = 1; b <= 3; b++) {
				if (b != a) {
					for (c = 1; c <= 3; c++) {
						if (c != a && c != b) {
							System.out.printf("%d, %d, %d\n", a, b, c);
						}
					}
				}
			}
		}

	}

}
