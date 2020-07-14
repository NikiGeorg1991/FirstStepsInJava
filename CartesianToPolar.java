import java.util.Scanner;

public class CartesianToPolar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x : ");
        double x = scan.nextDouble();
        System.out.println("Enter y : ");
        double y = scan.nextDouble();

        double r;
        double theta;


        r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("r = " + r);

        theta = Math.atan2(y, x);//in radians
        System.out.println("theta = " + Math.toDegrees(theta));//in Degrees

    }
}
