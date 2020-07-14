import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scan.nextDouble();

        System.out.println((number%2==0) ? "even" : "odd");
    }
}
