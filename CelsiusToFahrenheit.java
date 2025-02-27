import java.util.Scanner; // Importing Scanner class for user input

class CelsiusToFahrenheit{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the temperature in Celsius
		System.out.print("Enter temperature in celsius: ");
		float celsiusTemperature = sc.nextFloat(); // Reading the float input

		// Converting Celsius to Fahrenheit using the formula: (C * 9/5) + 32
		float fahrenheitTemperature = ( celsiusTemperature * 9 / 5 ) + 32;

		// Closing the Scanner to prevent resource leak
		sc.close();

		// Displaying the converted temperature in Fahrenheit
		System.out.print("Temperature in fahrenheit is: " + fahrenheitTemperature);
	}
}
