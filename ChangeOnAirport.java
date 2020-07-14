import java.util.Scanner;

public class ChangeOnAirport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of currency you have : ");

        int lev = 1;
        double dollar = 1.775;
        double euro = 1.955;

        System.out.println("Press 1 for Lev,\nPress 2 for Dollar,\nPress 3 for Euro. \n");
        int yourCurrency = scan.nextInt();

        System.out.println("Which currency you want to convert : ");
        System.out.println("Press 1 for Lev,\nPress 2 for Dollar,\nPress 3 for Euro. \n");
        int currencyToConvert = scan.nextInt();

        System.out.println("How much money you want to convert?");
        int value = scan.nextInt();
        double sum;

        if (yourCurrency == 1 && currencyToConvert == 1) {
            System.out.println("The money are same currency");
        } else {
            if (yourCurrency == 1 && currencyToConvert == 2) {
                sum = value * lev / dollar;
                System.out.println("You succesfully converted " + sum  + " dollars");
            } else {
                if (yourCurrency == 1 && currencyToConvert == 3) {
                    sum = value * lev / euro;
                    System.out.println("You succesfully converted " + sum + " euros");
                }
            }
        }

        if (yourCurrency == 2 && currencyToConvert == 2) {
            System.out.println("The money are same currency");
        } else {
            if (yourCurrency == 2 && currencyToConvert == 1) {
                sum = value * dollar / lev;
                System.out.println("You succesfully converted " + sum  + " levs");
            } else {
                if (yourCurrency == 2 && currencyToConvert == 3) {
                    sum = value * dollar / euro;
                    System.out.println("You succesfully converted " + sum + " euros");
                }
            }
        }

        if (yourCurrency == 3 && currencyToConvert == 3) {
            System.out.println("The money are same currency");
        } else {
            if (yourCurrency == 3 && currencyToConvert == 1) {
                sum = value * euro / lev;
                System.out.println("You succesfully converted " + sum  + " levs");
            } else {
                if (yourCurrency == 3 && currencyToConvert == 2) {
                    sum = value * euro / dollar;
                    System.out.println("You succesfully converted " + sum + " dollars");
                }
            }
        }
    }
}
