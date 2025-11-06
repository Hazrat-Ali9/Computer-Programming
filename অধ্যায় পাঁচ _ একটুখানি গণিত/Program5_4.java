package ComputerProgrammingPartOne;

import java.util.Scanner;

public class Program5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double loan_amount, interest_rate, number_of_years, total_amount, monthly_amount, yearly_interest_amount;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Enter the loan amount: ");
		loan_amount = scan.nextDouble();

		System.out.printf("Enter the interest rate: ");
		interest_rate = scan.nextDouble();

		System.out.printf("Number of years: ");
		number_of_years = scan.nextDouble();
		scan.close();

		yearly_interest_amount = loan_amount * interest_rate / 100.00;
		total_amount = loan_amount + yearly_interest_amount * number_of_years;
		monthly_amount = total_amount / (number_of_years * 12);

		System.out.printf("Total amount: %.2f\n", total_amount);
		System.out.printf("Monthly amount: %.2f\n", monthly_amount);

	}

}
