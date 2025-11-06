package ComputerProgrammingPartOne;

public class Program13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ara1[] = { 3, 1, 5, 2, 4 };
		int ara2[] = new int[5];

		int i, minimum, index_2, minimum_index = 0;

		for (index_2 = 0; index_2 < 5; index_2++) {
			minimum = 10000;

			for (i = 0; i < 5; i++) {
				if (ara1[i] < minimum) {
					minimum = ara1[i];
					minimum_index = i;
				}
			}

			ara1[minimum_index] = 10000;
			ara2[index_2] = minimum;
		}

		for (i = 0; i < 5; i++) {
			System.out.printf("%d\n", ara2[i]);
		}
	}

}
