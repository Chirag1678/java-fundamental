import java.util.Scanner; // Importing Scanner class for user input

class AreaOfCircle{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the radius of circle
		System.out.print("Enter the radius of circle: ");
		double radiusOfCircle = sc.nextDouble(); // Reading the radius of circle

		// Calculating the area of circle using the formula: pi * radius^2
		double areaOfCircle = Math.PI * Math.pow( radiusOfCircle , 2 );

		// Rounding the calculated area to five decimal places
		double areaOfCircleRounded = Math.round(areaOfCircle * 100000 ) / 100000.0;
		
		// Closing the Scanner to prevent resource leak
		sc.close();

		// Displaying the area of the circle with the given radius
		System.out.print("Area of circle with radius " + radiusOfCircle + " is: " + areaOfCircleRounded);
	}
}
