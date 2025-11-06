package ComputerProgrammingPartOne;

public class Program4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i = 1;

		for (;;) {
			if (i > 10) {
				break;
			}

			System.out.printf("%d X %d = %d\n", n, i, n * i);
			i = i + 1;
		}

	}

}
