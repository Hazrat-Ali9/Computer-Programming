package ComputerProgrammingPartOne;

public class Program11_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ara1 = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 }, { 100, 200, 300, 400, 500 },
				{ 1000, 2000, 3000, 4000, 5000 }, { 10000, 20000, 30000, 40000, 50000 } };
		int[][] ara2 = new int[5][5];

		int r, c;

		System.out.printf("Content of first array (ara1): \n");

		for (r = 0; r < 5; r++) {
			for (c = 0; c < 5; c++) {
				System.out.printf("%d ", ara1[r][c]);
			}

			System.out.printf("\n");
		}

		System.out.printf("\n");

		// now start copy
		for (r = 0; r < 5; r++) {
			for (c = 0; c < 5; c++) {
				ara2[c][r] = ara1[r][c];
			}
		}

		System.out.printf("Content of second array (ara2): \n");
		for (r = 0; r < 5; r++) {
			for (c = 0; c < 5; c++) {
				System.out.printf("%d ", ara2[r][c]);
			}
			System.out.printf("\n");
		}
	}

}
