package ComputerProgrammingPartOne;

public class Program7_2 {

	static double add(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		
		a = b = 2.5;
		c = add(a, b);
		System.out.printf("%f\n", c);
	}

}
