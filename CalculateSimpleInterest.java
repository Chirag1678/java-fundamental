import java.util.Scanner; // Importing Scanner class for user input

class CalculateSimpleInterest{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the principal amount
		System.out.print("Enter the principal amount: ");
		double principalAmount = sc.nextDouble(); // Reading the principal amount

		// Prompting the user to enter the annual interest rate (in percentage)
		System.out.print("Enter the interest rate: ");
		double interestRate = sc.nextDouble(); // Reading the interest rate

		// Prompting the user to enter the time period (in years)
		System.out.print("Enter the time period: ");
		double timePeriod = sc.nextDouble(); // Reading the time period

		// Calculating the simple interest using the formula: (P × R × T) / 100
		double simpleInterest = ( principalAmount * interestRate * timePeriod ) / 100.0;

		// Rounding the calculated interest to two decimal places for precision
		double simpleInterestRounded = Math.round( simpleInterest * 100 ) / 100.0;

		// Closing the Scanner to prevent resource leak
		sc.close();

		// Displaying the calculated simple interest
		System.out.print("Simple interest on amount " + principalAmount + " with interest rate of " + interestRate + "% per annum for " + timePeriod + " years is: " + simpleInterest);
	}
}
