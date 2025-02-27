import java.util.Scanner; // Importing Scanner class for user input

class VolumeOfACylinder{
	public static void main(String[] args){
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the radius of the cylinder
		System.out.print("Enter radius of cylinder: ");
		double radiusOfCylinder = sc.nextDouble(); // Reading the radius as a double

		// Prompting the user to enter the height of the cylinder
		System.out.print("Enter height of cylinder: ");
		double heightOfCylinder = sc.nextDouble(); // Reading the height as a double

		// Calculating the volume of the cylinder using the formula: pi * radius^2 * height
		double volumeOfCylinder = Math.PI * Math.pow( radiusOfCylinder , 2 ) * heightOfCylinder;

		// Rounding the calculated volume to five decimal places
		double volumeOfCylinderRounded = Math.round(volumeOfCylinder * 100000 ) / 100000.0;

		// Closing the Scanner to prevent resource leak
		sc.close();

		// Displaying the volume of the cylinder with the given radius and height
		System.out.print("Volume of cylinder with radius " + radiusOfCylinder + " and height " + heightOfCylinder + " is: " + volumeOfCylinderRounded );
	}
}
