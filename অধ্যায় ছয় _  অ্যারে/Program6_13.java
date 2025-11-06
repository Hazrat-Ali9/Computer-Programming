package ComputerProgrammingPartOne;

public class Program6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int total_marks[] = { 86, 78, 94, 68, 92, 78, 64, 62, 72, 61, 72, 66, 65, 65, 80, 72, 62, 68, 81, 62, 56, 68,
				58, 56, 82, 70, 74, 78, 76, 84, 88, 73, 62, 66, 76, 70, 67, 65, 77, 63 };
		int[] marks_count = new int[101];

		for (i = 0; i < 101; i++) {
			marks_count[i] = 0;
		}

		for (i = 0; i < 40; i++) {
			marks_count[total_marks[i]]++;
		}

		for (i = 50; i <= 100; i++) {
			System.out.printf("Marks: %d Count: %d\n", i, marks_count[i]);
		}

	}

}
