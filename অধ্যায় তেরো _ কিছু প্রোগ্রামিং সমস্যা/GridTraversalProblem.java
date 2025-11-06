package ComputerProgrammingPartOne;

import java.util.Scanner;

public class GridTraversalProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = new int[10][10];
		Scanner scan = new Scanner(System.in);
		int n, x, y;
		char c;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				grid[i][j] = 1;
			}
		}

		System.out.printf("Please enter the number of blocked cells: ");
		n = scan.nextInt();

		while (n < 0 || n > 100) {
			System.out.printf("Blocked cells number exceeds the capacity! Enter again: ");
			n = scan.nextInt();

		}

		if (n != 0) {
			System.out.printf("Now enter the cells: ");

			for (int i = 0; i < n; i++) {
				x = scan.nextInt();
				y = scan.nextInt();

				while (x < 0 || y < 0 || x > 9 || y > 9) {
					System.out.printf("Error! Index out of bound. Enter again: ");
					x = scan.nextInt();
					y = scan.nextInt();
				}
				grid[x][y] = 0;
			}
		}

		if (n == 100) {
			System.out.printf("All cells blocked! Can't land anywhere! Program stops.");
			System.exit(0);
		}

		System.out.printf("Please enter the initial position: ");
		x = scan.nextInt();
		y = scan.nextInt();

		while (x < 0 || y < 0 || x > 9 || y > 9) {
			System.out.printf("Error! Index out of bound. Enter again: ");
			x = scan.nextInt();
			y = scan.nextInt();
		}

		while (grid[x][y] == 0) {
			System.out.printf("Cell %d, %d is blocked. Can't land here! Enter again: ", x, y);
			x = scan.nextInt();
			y = scan.nextInt();
		}

		System.out.printf("Now, please enter your choice. U (up), D (down), L (left), R (right), S (stop): ");

		while (true) {
			c = scan.next().charAt(0);

			if (c == 'S') {
				break;
			} else if (c == 'U') {
				x--;
				if (x < 0) {
					System.out.printf("Cant' move up anymore, stuck on the wall!\n");
					x++;
					continue;
				}

				if (grid[x][y] == 1) {
					System.out.printf("Moved 1 grid up. Moved to (%d, %d)\n", x, y);
				} else if (grid[x][y] == 0) {
					System.out.printf("Cant' move up! Cell (%d, %d) is blocked!\n", x, y);
					x++;
				}
			} else if (c == 'D') {
				x++;
				if (x > 9) {
					System.out.printf("Cant' move down anymore, stuck on the wall!\n");
					x--;
					continue;
				}

				if (grid[x][y] == 1) {
					System.out.printf("Moved 1 grid down. Moved to (%d, %d)\n", x, y);
				} else if (grid[x][y] == 0) {
					System.out.printf("Cant' move down! Cell (%d, %d) is blocked!\n", x, y);
					x--;
				}
			} else if (c == 'R') {
				y++;
				if (y > 9) {
					System.out.printf("Cant' move right anymore, stuck on the wall!\n");
					y--;
					continue;
				}

				if (grid[x][y] == 1) {
					System.out.printf("Moved 1 grid right. Moved to (%d, %d)\n", x, y);
				} else if (grid[x][y] == 0) {
					System.out.printf("Cant' move right! Cell (%d, %d) is blocked!\n", x, y);
					y--;
				}
			} else if (c == 'L') {
				y--;
				if (y < 0) {
					System.out.printf("Cant' move left anymore, stuck on the wall!\n");
					y++;
					continue;
				}

				if (grid[x][y] == 1) {
					System.out.printf("Moved 1 grid left. Moved to (%d, %d)\n", x, y);
				} else if (grid[x][y] == 0) {
					System.out.printf("Cant' move left! Cell (%d, %d) is blocked!\n", x, y);
					y++;
				}
			}
		}

		scan.close();
		System.out.printf("Final position of the robot is: (%d, %d)\n", x, y);

	}

}
