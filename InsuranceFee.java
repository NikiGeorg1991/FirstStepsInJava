import java.util.Scanner;

public class InsuranceFee {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        System.out.println("Enter your ages: ");
        int age = scan.nextInt();
        double tax;
        double workerFee;
        double employerFee;
        final double TAX_20 = 0.2;
        final double TAX_17 = 0.17;
        final double TAX_13 = 0.13;
        final double TAX_9 = 0.09;
        final double TAX_7_5 = 0.75;
        final double TAX_5 = 0.05;

        if (salary > 0) {
            if (salary <= 3000) {
                if (age >= 0) {
                    if (age > 18) {
                        if (age <= 55) {
                            workerFee = salary * TAX_20;
                            System.out.println("workerFee = " + workerFee);
                            employerFee = salary * TAX_17;
                            System.out.println("employerFee = " + employerFee);
                            tax = workerFee + employerFee;
                            System.out.println("Total tax = " + tax);
                        }
                        if (age > 55 && age <= 60) {
                            workerFee = salary * TAX_13;
                            System.out.println("workerFee = " + workerFee);
                            employerFee = salary * TAX_13;
                            System.out.println("employerFee = " + employerFee);
                            tax = workerFee + employerFee;
                            System.out.println("Total tax = " + tax);
                        }
                        if (age > 60 && age <= 65) {
                            workerFee = salary * TAX_7_5;
                            System.out.println("workerFee = " + workerFee);
                            employerFee = salary * TAX_9;
                            System.out.println("employerFee = " + employerFee);
                            tax = workerFee + employerFee;
                            System.out.println("Total tax = " + tax);
                        }
                        if (age > 65) {
                            workerFee = salary * TAX_5;
                            System.out.println("workerFee = " + workerFee);
                            employerFee = salary * TAX_7_5;
                            System.out.println("employerFee = " + employerFee);
                            tax = workerFee + employerFee;
                            System.out.println("Total tax = " + tax);
                        }
                    } else {
                        System.out.println("You are too young to work.");
                    }
                } else {
                    System.out.println("Are you alive?");
                }
            } else {
                if (salary > 3000) {
                    if (age >= 0) {
                        if (age > 18) {
                            workerFee = salary * TAX_20;
                            System.out.println("workerFee = " + workerFee);
                            employerFee = salary * TAX_20;
                            System.out.println("employerFee = " + employerFee);
                            tax = workerFee + employerFee;
                            System.out.println("Total tax = " + tax);
                        }
                    }
                }
            }
        } else {
            System.out.println("Did you work this month ?");
        }
    }
}