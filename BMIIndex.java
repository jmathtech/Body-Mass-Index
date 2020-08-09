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


		System.out.println("Enter the user's height in inches: ");
		// Input
		Scanner input = new Scanner(System.in);

		double heightInches = input.nextInt();

		System.out.println("Enter the user's weight in Pounds: ");

		double weightPounds = input.nextInt();

		double heightMeters = heightInches * 2.54/100;
		double weightKilos = weightPounds * 453.59/1000;
		double bmi = weightKilos/(heightMeters * heightMeters);

		// Output

		System.out.println("Your BMI is: " + bmi);

		// Close program

		input.close();

	}

}
