import java.util.Scanner; // Importing Scanner class for user input

class PerimeterOfARectangle{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the length of the rectangle
		System.out.print("Enter length of rectangle: ");
		float lengthOfRectangle = sc.nextFloat(); // Reading the length as a float

		// Prompting the user to enter the width of the rectangle
		System.out.print("Enter width of reactangle: ");
		float widthOfRectangle = sc.nextFloat(); // Reading the width as a float

		// Calculating the perimeter using the formula: 2 × (Length + Width)
		float perimeterOfRectangle = 2 * ( lengthOfRectangle + widthOfRectangle );

		// Closing the Scanner to prevent resource leak
		sc.close();

		// Displaying the calculated perimeter of the rectangle
		System.out.print("Perimeter of Rectangle with length "+ lengthOfRectangle + " and width " + widthOfRectangle + " is: " + perimeterOfRectangle);
	}
}
