import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NamesInList {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names you will add in list ? ");
        int number = scan.nextInt();
        System.out.println("Enter at least " + number + " names");
        String name;
        int counter = 1;
        do {
            System.out.println("Enter " + counter + " name : ");
            name = scan.next();
            names.add(name);
            counter++;
        } while (counter < (number + 1));


        System.out.println("5th element is "+names.get(5));
        Collections.sort(names);
        ArrayList<String> names1 = new ArrayList<String>(names.size());
        System.out.print("List is sorted : ");
        System.out.println(names);

        Collections.reverse(names);
        System.out.print("List is sorted foots up");
        System.out.println(names);
        Collections.shuffle(names);
        System.out.print("List is shuffled : ");
        System.out.println(names);
    }
}
