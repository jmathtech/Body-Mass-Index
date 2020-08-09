package weightClass;

import java.util.Scanner;


// declarations
public class BMIIndex {

	double heightInches;
	double weightPounds;
	double heightMeters;
	double weightKilos;
	double bmi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Title of the Program
		System.out.println("||||| Body Mass Index | Calculator ||||");
		System.out.println("_______________________________________");
		System.out.println("");

		// Prompt for user input to collect data
		System.out.println("Enter the user's height in inches: ")
		Scanner input = new Scanner(System.in);

		double heightInches = input.nextInt();
		System.out.println("Enter the user's weight in Pounds: ");
		
		// Processes and calculates the functionality per metric
		// This function will require all other double "variables (up top)" to calculate the math 
		double weightPounds = input.nextInt();
		double heightMeters = heightInches * 2.54/100;
		double weightKilos = weightPounds * 453.59/1000;
		double bmi = weightKilos/(heightMeters * heightMeters);

		// Outputs the BMI result here
		System.out.println("Your BMI is: " + bmi);

		// Close program
		input.close();

	}

}
