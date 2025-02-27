import java.util.Scanner; // Importing Scanner class for user input

class AddTwoNumbers{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the first number
		System.out.print("Enter first number: ");
		int firstNumber = sc.nextInt(); // Reading the first integer input

		// Prompting the user to enter the second number
		System.out.print("Enter second number: ");
		int secondNumber = sc.nextInt(); // Reading the second integer input

		// Closing the Scanner to prevent resource leak
		sc.close();

		// Performing addition of the two numbers
		int additionOfNumbers = firstNumber + secondNumber;

		// Displaying the result of addition
		System.out.print("Addition of numbers is: " + additionOfNumbers);
	}
}
