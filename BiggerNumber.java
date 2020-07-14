import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNumber = scan.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scan.nextDouble();

        if(firstNumber>=secondNumber){
            if(firstNumber==secondNumber){
                System.out.println("Number are with same value." + firstNumber);
            }else{
                System.out.println("Biggest number is first - " + firstNumber);
            }
        }else {
            System.out.println("Biggest number is second - " + secondNumber);
        }
    }
}
