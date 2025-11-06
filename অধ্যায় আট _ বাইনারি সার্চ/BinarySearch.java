package ComputerProgrammingPartOne;

public class BinarySearch {

	static int b_search(int ara[], int low, int high, int key) {
		int mid = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			if (key == ara[mid]) {
				break;
			}
			if (key < ara[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		if (low > high) {
			return 0;
		} else {
			return mid;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ara[] = { 1, 4, 6, 8, 9, 11, 14, 15, 20, 25, 33, 83, 87, 97, 99, 100 };
		int low_indx = 0;
		int high_indx = 15;
		int mid_indx = 0;
		int num = 97;

		mid_indx = b_search(ara, low_indx, high_indx, num);

		if (mid_indx == 0) {
			System.out.printf("%d is not in the array\n", num);
		} else {
			System.out.printf("%d is found in the array. It is the %d th element of the array.\n", ara[mid_indx],
					mid_indx);
		}

	}

}
