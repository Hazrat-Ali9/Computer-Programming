package ComputerProgrammingPartOne;

public class Program7_9 {

	static void test_function(int ara[]) {
		ara[0] = 100;
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ara[] = { 1, 2, 3, 4, 5 };

		System.out.printf("%d\n", ara[0]);
		test_function(ara);
		System.out.printf("%d\n", ara[0]);
	}

}
