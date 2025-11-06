package ComputerProgrammingPartOne;

public class Program6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ara[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] ara2 = new int[10];
		int i, j;

		for (i = 0, j = 9; i < 10; i++, j--) {
			ara2[j] = ara[i];
		}

		for (i = 0; i < 10; i++) {
			ara[i] = ara2[i];
		}

		for (i = 0; i < 10; i++) {
			System.out.printf("%d\n", ara[i]);
		}

	}

}
