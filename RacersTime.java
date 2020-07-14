import java.util.Arrays;
import java.util.Scanner;

public class RacersTime {
    public static void main(String[] args) {

        double[] array = new double[0];
        int numberRacers;
        int counter = 1;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double totalTime = 0;
        double avg = 0;
        double standartDeviation = 0;
        double standartDeviation1 = 0;
        double devSum = 0;


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
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            totalTime += array[i];
        }
        System.out.println("Fastest racer with time " + max);
        System.out.println("Lowest racer with time " + min);
        System.out.println("Total time of all players is " + totalTime);
        avg = totalTime / numberRacers;
        System.out.println("avg = " + avg);

        for (double num : array) {
            standartDeviation1 += Math.pow(num - avg, 2);
        }
        standartDeviation = Math.sqrt(standartDeviation1/numberRacers);
        System.out.println("standartDeviation = " + standartDeviation);
    }
}