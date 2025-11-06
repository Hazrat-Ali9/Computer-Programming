package ComputerProgrammingPartOne;

//import java.util.Scanner;

public class Program11_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] marks = { { 80, 70, 92, 78, 58, 83, 85, 66, 99, 81 }, { 75, 67, 55, 100, 91, 84, 79, 61, 90, 97 },
				{ 98, 67, 75, 89, 81, 83, 80, 90, 88, 77 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		int col;

		for (col = 0; col < 10; col++) {
			marks[3][col] = (int) (marks[0][col] / 4.0 + marks[1][col] / 4.0 + marks[2][col] / 2.0);

			System.out.printf("Roll NO: %d Total Marks: %d\n", col + 1, marks[3][col]);
		}

		// to get inputs from user
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * for (int i = 0; i < marks.length; i++) { for (int j = 0; j < 10; j++) {
		 * marks[i][j] = scan.nextInt(); } } scan.close();
		 */
	}
}
