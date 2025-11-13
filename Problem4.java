import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] sum;
		int N;
		char[] wordInArray;

		N = scan.nextInt();
		scan.nextLine();
		sum = new int[N];

		for (int i = 0; i < N; i++) {
			int individualSum = 0;
			wordInArray = scan.nextLine().toCharArray();

			for (char c : wordInArray) {
				individualSum = individualSum + (int) c;
			}

			sum[i] = individualSum;
		}
		scan.close();

		for (int i = 0; i < sum.length; i++) {
			System.out.printf("%d\n", sum[i]);
		}

	}

}
