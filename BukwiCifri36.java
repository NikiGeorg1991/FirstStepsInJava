import java.util.Random;

public class BukwiCifri36 {
    public static void main(String[] args) {

        long number = new Random().nextLong();
        System.out.println("number = " + number);
        String result = Long.toString(number, 36);
        System.out.println("result = " + result);
    }
}
