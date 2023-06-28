package main.java.com.exercises;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        // CONSTANTS
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        // request values for the calculate
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal= scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1k and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT /MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if(years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a valuer between 1 and 30");
        }

        // Calculate operation
        double monthlyPayment = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        NumberFormat formatForPayment = NumberFormat.getCurrencyInstance();
        String resultMortgagePayment = formatForPayment.format(monthlyPayment);

        System.out.print("Mortgage: " + resultMortgagePayment);
    }

}
