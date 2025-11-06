package ComputerProgrammingPartOne;

public class Picture13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spaceCounter = 0;
		int cCounter = 7;

		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < spaceCounter; j++) {
				System.out.printf(" ");
			}

			for (int j = 0; j < cCounter; j++) {
				System.out.printf("c");
			}

			System.out.printf("\n");

			if (i >= (int) (13 / 2)) {
				spaceCounter--;
				cCounter++;
			} else {
				spaceCounter++;
				cCounter--;
			}
		}

	}

}
