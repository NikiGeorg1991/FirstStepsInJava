import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Your weight in kilos: ");
        double weight = sc.nextDouble();
        System.out.println("Your height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / Math.pow(height,2);
        System.out.println("BMI = " + BMI);
    }
}
