package ComputerProgrammingPartOne;

public class Program4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n = 5;
		int i;

		m = 0;

		for (i = 1; i <= 10; i = i + 1) {
			m = m + n;
			System.out.printf("%d X %d = %d\n", n, i, m);
		}

	}

}
