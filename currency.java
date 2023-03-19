
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in Nepalese rupaiya: ");

        if (input.hasNextDouble()) {
            double nepaliRup = input.nextDouble();
            double usDoll = nepaliRup / 118.50;
            System.out.printf("%.2f Nepalese rupaiya = %.2f US dollars\n", nepaliRup, usDoll);
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        input.close();
    }
}
