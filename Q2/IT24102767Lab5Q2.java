import java.util.Scanner;

public class IT24102767Lab5Q2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = input.nextInt();

        // Validate the entered number (should be greater than or equal to 0)
        if (newMembers < 0) {
            System.out.println("Invalid input! The number of new members must be greater than or equal to 0.");
        } else {
            // Determine the prize based on the number of new members using a switch statement
            switch (newMembers) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Prize: Pen");
                    break;
                case 2:
                    System.out.println("Prize: Umbrella");
                    break;
                case 3:
                    System.out.println("Prize: Bag");
                    break;
                case 4:
                    System.out.println("Prize: Travelling Chair");
                    break;
                default:
                    System.out.println("Prize: Headphone");
                    break;
            }
        }

        // Close the Scanner object
        input.close();
    }
}
