package ComputerProgrammingPartOne;

public class Program4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;

		while (n < 10) {
			n = n + 1;

			if (n % 2 == 0) {
				continue;
			}
			System.out.printf("%d\n", n);
		}

	}

}
