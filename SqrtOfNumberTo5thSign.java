import java.util.Scanner;

public class SqrtOfNumberTo5thSign {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scan.nextDouble();
        double result;

        result = Math.sqrt(number);
        System.out.printf("result  = " + "%.5f",result );

    }
}
