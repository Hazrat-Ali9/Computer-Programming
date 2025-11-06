package ComputerProgrammingPartOne;

public class Program6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ft_marks[] = { 83, 86, 97, 95, 93, 95, 86, 52, 49, 41, 42, 47, 90, 59, 63, 86, 40, 46, 92, 56, 51, 48, 67,
				49, 42, 90, 42, 83, 47, 95, 69, 82, 82, 58, 69, 67, 53, 56, 71, 62 },
				st_marks[] = { 86, 97, 95, 93, 95, 86, 52, 49, 41, 42, 47, 90, 59, 63, 86, 40, 46, 92, 56, 51, 48, 67,
						49, 42, 90, 42, 83, 47, 95, 69, 82, 82, 58, 69, 67, 53, 56, 71, 62, 49 },
				final_marks[] = { 87, 64, 91, 43, 89, 66, 58, 73, 99, 81, 100, 64, 55, 69, 85, 81, 80, 67, 88, 71, 62,
						78, 58, 66, 98, 75, 86, 90, 80, 85, 100, 64, 55, 69, 85, 81, 80, 67, 88, 71 };

		int i;
		double[] total_marks = new double[40];

		for (i = 0; i < 40; i++) {
			total_marks[i] = ft_marks[i] / 4.0 + st_marks[i] / 4.0 + final_marks[i] / 2.0;
		}

		for (i = 1; i <= 40; i++) {
			System.out.printf("Roll NO: %d\tTotal Marks: %.0f\n", i, total_marks[i - 1]);
		}

	}

}
