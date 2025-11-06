package ComputerProgrammingPartOne;

public class Program6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ara[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int i, j, temp;

		for (i = 0, j = 9; i < 10; i++, j--) {
			if (i > j) {
				break;
			}
			else {
				temp = ara[j];
				ara[j] = ara[i];
				ara[i] = temp;
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.printf("%d\n", ara[i]);
		}

	}

}
