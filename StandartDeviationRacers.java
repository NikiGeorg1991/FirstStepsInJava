import java.util.Scanner;

public class StandartDeviationRacers {
    public static void main(String[] args) {
        double[] array = new double[0];
        int numberRacers;
        int counter = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of racers : ");
        numberRacers = scan.nextInt();
        if (numberRacers <= 0) {
            System.out.println("Invalid input");
        } else {
            array = new double[numberRacers];
            for (int i = 0; i < numberRacers; i++) {
                System.out.println("Enter time for racer number" + counter + " : ");
                array[i] = scan.nextDouble();
                counter++;
            }
        }
        System.out.println("standard deviation is " + stdDev(array));
    }

    public static double stdDev(double... values) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = values.length;

        for (double num : values) {
            sum += num;
        }

        double avg = sum / length;

        for (double num : values) {
            standardDeviation += Math.pow(num - avg, 2);
        }

        return Math.sqrt(standardDeviation / length);
    }
}

