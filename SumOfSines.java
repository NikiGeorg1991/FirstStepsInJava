public class SumOfSines {
    public static void main(String[] args) {

        double t = 30;//degrees
        double convertT = Math.toRadians(t);//to radians

        double sumOfSines;
        double sin2t;
        double sin3t;
        sin2t = Math.sin(2 * convertT);
        System.out.println("sin2t = " + sin2t);
        sin3t = Math.sin(3 * convertT);
        System.out.println("sin3t = " + sin3t);
        sumOfSines = sin2t + sin3t;
        System.out.println("sumOfSines = " + sumOfSines);

    }
}
