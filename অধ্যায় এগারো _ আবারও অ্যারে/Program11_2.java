package ComputerProgrammingPartOne;

public class Program11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] namta = new int[10][10];
		int row, col, evenCount = 0, oddCount = 0, sum = 0;

		for (row = 0; row < 10; row++) {
			for (col = 0; col < 10; col++) {
				namta[row][col] = (row + 1) * (col + 1);
			}
		}

		for (row = 0; row < 10; row++) {
			for (col = 0; col < 10; col++) {
				System.out.printf("%d x %d = %d\n", (row + 1), (col + 1), namta[row][col]);
			}
			System.out.printf("\n");
		}

		for (row = 0; row < 10; row++) {
			for (col = 0; col < 10; col++) {
				if (namta[row][col] % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}

				sum = sum + namta[row][col];
			}
		}
		System.out.printf("Odd count = %d, Even count = %d, Sum = %d\n", oddCount, evenCount, sum);
	}

}
