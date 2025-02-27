import java.util.Scanner; // Importing Scanner class for user input

class ConvertKilometersToMiles{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to add distance in kilometers
		System.out.print("Enter the distance in kilometers: ");
		float distanceInKilometers = sc.nextFloat(); // Reading the distance as a float

		// Calculating the distance in miles using the formula: Miles = Kilometers * 0.621371
		float distanceInMiles = distanceInKilometers * (float)0.621371;

		// Closing the Scanner to prevent resource leak
		sc.close();

		// Displaying the converted distance in miles
		System.out.print("Distance in miles for " + distanceInKilometers + " Kms is: " + distanceInMiles);
	}
}
