import java.util.Scanner; // Importing Scanner class for user input

class CalculateAverageOfThreeNumbers{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the first number
		System.out.print("Enter first number: ");
		int firstNumber = sc.nextInt(); // Reading the first number

		// Prompting the user to enter the second number
		System.out.print("Enter second number: ");
		int secondNumber = sc.nextInt(); // Reading the second number

		// Prompting the user to enter the third number
		System.out.print("Enter third number: ");
		int thirdNumber = sc.nextInt(); // Reading the third number

		// Calculating the average of three numbers as a double for more precision
		double averageOfNumbers = ( firstNumber + secondNumber + thirdNumber ) / 3.0;

		// Closing the Scanner to prevent resource leak
		sc.close();

		// Displaying the resulting avergae of three numbers
		System.out.print("Average of numbers " + firstNumber + ", " + secondNumber + " and " + thirdNumber + " is: " + averageOfNumbers);
	}
}	
