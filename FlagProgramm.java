import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FlagProgramm {
    public static void main(String[] args) {

        char symbol1 = '*';
        char symbol2 = '+';
        char symbol3 = '-';
        char symbol4 = '/';
        char symbol5 = '\u2588';
        char symbol6 = '\u1234';
        String color1 = "\033[32m";
        String color2 = "\033[31m";
        String color3 = "\033[30m";
        char[] array;
        System.out.println("Enter how long to be flag : ");
        Scanner scan = new Scanner(System.in);
        int flagLength = scan.nextInt();
        array = new char[flagLength];
        Arrays.fill(array,symbol1);
        System.out.println(array);
        Arrays.fill(array,symbol2);
        System.out.print(color1);
        System.out.println(array);
        Arrays.fill(array,symbol3);
        System.out.println(array);
        System.out.print(color2);
        Arrays.fill(array,symbol4);
        System.out.println(array);
        Arrays.fill(array,symbol5);
        System.out.println(array);
        Arrays.fill(array,symbol6);
        System.out.println(array);
    }
}
