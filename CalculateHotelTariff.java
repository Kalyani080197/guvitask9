package task9;

import java.util.Scanner;

public class CalculateHotelTariff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of nights stayed and room rate per night
        System.out.println("Enter the number of nights stayed:");
        int numberOfNights = scanner.nextInt();

        System.out.println("Enter the room rate per night:");
        double roomRatePerNight = scanner.nextDouble();

        // Calculate the hotel tariff
        double hotelTariff = numberOfNights * roomRatePerNight;

        // Print the hotel tariff
        System.out.printf("%.2f%n", hotelTariff);

        // Close the scanner to prevent resource leak
        scanner.close();
	}

}
