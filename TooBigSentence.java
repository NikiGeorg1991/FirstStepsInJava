import java.util.Scanner;

public class TooBigSentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String text = scan.nextLine();

        int wordNumbers = text.split(" ").length;
        System.out.println("The number of words are : " + wordNumbers);
        if (wordNumbers >= 1) {
            switch (wordNumbers) {
                case 1:
                    System.out.println("One.");
                    break;
                case 2:
                    System.out.println("Two.");
                    break;
                case 3:
                    System.out.println("Three.");
                    break;
                case 4:
                    System.out.println("Four.");
                    break;
                case 5:
                    System.out.println("Five.");
                    break;
                case 6:
                    System.out.println("Six.");
                    break;
                case 7:
                    System.out.println("Seven.");
                case 8:
                    System.out.println("Eight.");
                    break;
                case 9:
                    System.out.println("Nine.");
                    break;
                case 10:
                    System.out.println("Ten.");
                    break;
                default:
                    System.out.println("Too big sentence.");
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
