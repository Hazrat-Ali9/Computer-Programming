package ComputerProgrammingPartOne;

public class Picture13_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spaceCounter = 18;
		int cCounter = 2;

		for (int i = 0; i < 10; i++) {

			for (int j2 = 0; j2 < cCounter / 2; j2++) {
				System.out.printf("c");
			}

			for (int j2 = 0; j2 < spaceCounter; j2++) {
				System.out.printf(" ");
			}

			for (int j2 = cCounter / 2; j2 < cCounter; j2++) {
				System.out.printf("c");
			}

			cCounter += 2;
			spaceCounter -= 2;
			System.out.printf("\n");
		}

	}

}
