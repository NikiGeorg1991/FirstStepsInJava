import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||
                    text.charAt(i)=='o'||text.charAt(i)=='u'||text.charAt(i)=='y'||
                    text.charAt(i)=='A'||text.charAt(i)=='E'||text.charAt(i)=='I'||
                    text.charAt(i)=='O'||text.charAt(i)=='U'||text.charAt(i)=='Y') {
                counter++;
            }
        }
        System.out.println("vowels = " + counter);

    }
}
