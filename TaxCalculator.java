import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a salary : ");
        double salary = scan.nextDouble();
        double tax;

        if (salary > 0) {
            if (salary < 20000) {
                System.out.println("There are no taxes.");
            }
            if (salary >= 20000 && salary <= 40000) {
                tax = (salary - 20000) * 0.1;
                System.out.println("The tax is " + tax);
            }
            if (salary > 40000 && salary <= 60000) {
                tax = (salary - 40000) * 0.2 + 20000 * 0.1;
                System.out.println("The tax is " + tax);
            }
            if (salary > 60000) {
                tax = (salary - 60000) * 0.3 + 40000 * 0.2 + 20000 * 0.1;
                System.out.println("The tax is " + tax);
            }
        } else {
            System.out.println("Next month you must work harder.");
        }
    }
}
