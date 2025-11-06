package ComputerProgrammingPartOne;

public class Program7_3 {

	double add(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		Program7_3 object = new Program7_3();

		a = 2.8;
		b = 2.7;

		c = object.add(a, b);

		System.out.printf("%f\n", c);

	}

}
