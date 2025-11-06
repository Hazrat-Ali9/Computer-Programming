package ComputerProgrammingPartOne;

public class Program7_7 {

	static double pi = 3.14;

	static void my_fnc() {
		pi = 3.1416;
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%f\n", pi);
		my_fnc();
		System.out.printf("%f\n", pi);
	}

}
