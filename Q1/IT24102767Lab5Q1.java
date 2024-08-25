import java.util.Scanner;

public class IT24102767Lab5Q1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scan.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scan.nextInt();
        
        System.out.println("User Entered numbers are: " + num1 + " " + num2 + " " + num3);
        
        
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        
        
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        
        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
        
        scan.close();
    }
}
