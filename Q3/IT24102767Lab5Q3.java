import java.util.Scanner;

public class IT24102767Lab5Q3 {
    // Constants for room charges and discount rates
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int DISCOUNT_10_DAYS = 3;
    public static final int DISCOUNT_20_DAYS = 5;
    public static final double DISCOUNT_RATE_10 = 10.0;
    public static final double DISCOUNT_RATE_20 = 20.0;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the start date of the reservation
        System.out.print("Enter the start date (day) of the reservation: ");
        int startDate = input.nextInt();

        // Prompt the user to enter the end date of the reservation
        System.out.print("Enter the end date (day) of the reservation: ");
        int endDate = input.nextInt();

        // Validation 1: Start date and end date cannot be less than 1 or greater than 31
        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            input.close();
            return; // Exit the program if the validation fails
        }

        // Validation 2: Start date should be less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            input.close();
            return; // Exit the program if the validation fails
        }

        // Calculate the number of days reserved
        int daysReserved = endDate - startDate;

        // Determine the applicable discount rate
        double discountRate = 0.0;
        if (daysReserved >= DISCOUNT_10_DAYS && daysReserved < DISCOUNT_20_DAYS) {
            discountRate = DISCOUNT_RATE_10;
        } else if (daysReserved >= DISCOUNT_20_DAYS) {
            discountRate = DISCOUNT_RATE_20;
        }

        // Calculate the total amount before discount
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;

        // Apply the discount if applicable
        double discountAmount = (totalAmount * discountRate) / 100;
        double finalAmount = totalAmount - discountAmount;

        // Display the results
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount amount: Rs " + discountAmount);
        System.out.println("Total amount to be paid: Rs " + finalAmount);

        // Close the Scanner object
        input.close();
    }
}
