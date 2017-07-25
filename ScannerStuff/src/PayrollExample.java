import java.util.Scanner;

/**
 * Scanner doing some keyboard scanning. And explaining with in-line comments.
 */
public class PayrollExample {
    public static void main(String[] args) {

        String name; // To hold a name
        int hours; // Hours worked
        double payRate; // Hourly pay rate
        double grossPay; // Gross pay

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in); // keyboard is just a variable name.

        // Get the user's name.
        System.out.print("What is your name? ");
        name = keyboard.nextLine(); // nextLine used because it's a name.

        // Get the number of hours worked this week.
        System.out.print("How many hours did you work this week ?");
        hours = keyboard.nextInt(); // nextInt used because it's an Integer.

        // Get the user's hourly pay rate.
        System.out.print("What is your hourly pay rate? ");
        payRate = keyboard.nextDouble(); // nextDouble because it might not be an integer the pay rate.

        // Calculate the gross pay
        grossPay = hours * payRate;

        // Display the resulting information.
        System.out.println(" Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);

    }
}
