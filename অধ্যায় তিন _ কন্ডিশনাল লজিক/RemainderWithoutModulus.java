package ComputerProgrammingPartOne;

public class RemainderWithoutModulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, remainder, quotient, maxValue;

		number = 11;

		quotient = number / 2;
		maxValue = quotient * 2;
		remainder = number - maxValue;

		System.out.printf("Remainder is %d\n", remainder);
	}

}
