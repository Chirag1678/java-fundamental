import java.util.Scanner; // Importing Scanner class for user input

class PowerCalculation{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the base number
		System.out.print("Enter the base number: ");
		int baseNumber = sc.nextInt(); // Reading the base number as an integer

		// Prompting the user to enter the exponent number
		System.out.print("Enter the exponent number: ");
		int exponentNumber = sc.nextInt(); // Reading the exponent number as an integer

		// Calculating the power using Math.pow() and type casting the result to int
		int powerNumber = (int)Math.pow( baseNumber , exponentNumber );

		// Closing the Scanner to prevent resource leak
		sc.close();

		// Displaying the calculated result
		System.out.print("Base " + baseNumber + " raised to the power of " + exponentNumber + " is: " + powerNumber);
	}
}
