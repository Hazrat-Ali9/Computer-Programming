package ComputerProgrammingPartOne;

public class AreaOfCircle {

	public static final double PI = 3.14159;

	static double find_circle_area(double radius) {
		return PI * radius * radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 3;

		double area = find_circle_area(radius);

		System.out.printf("%.2f\n", area);

	}

}
