package ComputerProgrammingPartOne;

public class Program7_4 {

	// we don't need method prototype in Java
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.8, b = 2.7, c;
		c = add(a, b);
		System.out.printf("%f\n", c);
	}

	static double add(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}

}
