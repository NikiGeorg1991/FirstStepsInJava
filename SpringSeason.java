import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month (for example march = 3) :");
        int month = scan.nextInt();
        System.out.println("Enter a day :");
        int day = scan.nextInt();

        System.out.println((month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20) ? "true" : "false");


//        if ((month >= 3 && month <= 6) && (day >= 1 && day <= 31)) {
//            if (month == 3 && day >= 20) {
//                System.out.println("true");
//            }
//            if (month == 6 && day <= 20) {
//                System.out.println("true");
//            }
//            if ((month == 4) && (day <= 30)) {
//                System.out.println("true");
//            }
//            if (month == 5) {
//                System.out.println("true");
//            }
//        } else {
//            System.out.println("false");
//        }

    }
}
