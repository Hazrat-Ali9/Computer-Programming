package ComputerProgrammingPartOne;

public class Picture13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 7;

		for (int i = 0; i < 13; i++) {

			for (int j = 0; j < counter; j++) {
				System.out.printf("c");
			}
			
			System.out.printf("\n");

			if (i >= (int) (13 / 2)) {
				counter++;
			} else {
				counter--;
			}
		}

	}

}
