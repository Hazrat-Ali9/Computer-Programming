package ComputerProgrammingPartOne;

public class Program7_6 {

	static int test_function(int x) {
		int y = x;
		x = 2 * y;
		return (x * y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20, z = 30;

		z = test_function(x);
		System.out.printf("%d %d %d\n", x, y, z);

	}

}
