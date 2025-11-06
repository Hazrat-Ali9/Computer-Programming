package ComputerProgrammingPartOne;

public class Program7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ara[] = { 100, 0, 53, 22, 83, 23, 89, 132, 201, 3, 85 };
		int n = 11;

		int max = find_max(ara, n);
		System.out.printf("%d\n", max);

		int min = find_min(ara, n);
		System.out.printf("%d\n", min);

		int sum = find_sum(ara, n);
		System.out.printf("%d\n", sum);

		double average = find_average(ara, n);
		System.out.printf("%.2f\n", average);
	}

	static int find_max(int ara[], int n) {
		int max = ara[0];
		int i;
		for (i = 1; i < n; i++) {
			if (ara[i] > max) {
				max = ara[i];
			}
		}
		return max;
	}

	static int find_min(int ara[], int n) {
		int min = ara[0];
		int i;
		for (i = 1; i < n; i++) {
			if (ara[i] < min) {
				min = ara[i];
			}
		}
		return min;
	}

	static int find_sum(int ara[], int n) {
		int sum = 0;
		int i;
		for (i = 0; i < n; i++) {
			sum += ara[i];
		}
		return sum;
	}

	static double find_average(int ara[], int n) {
		int sum = find_sum(ara, n);

		return (double) sum / n;
	}

}
