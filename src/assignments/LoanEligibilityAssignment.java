package assignments;

import java.util.Scanner;

public class LoanEligibilityAssignment {
    static int age;
    static double salary, emi, disposableIncome;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = scanner.nextInt();
        System.out.println("Enter your salary : ");
        salary = scanner.nextDouble();
        System.out.println("Enter your emi : ");
        emi = scanner.nextDouble();
        disposableIncome = salary - emi;
        checkElgibility(age, disposableIncome);
    }

    private static void checkElgibility(int age, double salary) {
        if (age > 24 && age < 61 && salary > 14999) {
            System.out.println("Yay! you are eligible for the loan");
        } else if (age > 60 && salary > 24999) {
            System.out.println("Yay! you are eligible for the loan");
        } else if (age < 25 && salary > 9999) {
            System.out.println("Yay! you are eligible for the loan");
        } else {
            System.out.println("Sorry you are not eligible for load at this moment");
        }
    }
}
