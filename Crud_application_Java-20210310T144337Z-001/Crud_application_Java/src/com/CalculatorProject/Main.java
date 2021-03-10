package com.CalculatorProject;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        final byte Months_In_Years = 12;
        final byte Percentage = 100;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter Principal Amount= ");
        int Principal=scanner.nextInt();

        System.out.println("Please Enter annual Interest Rate= ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest /Percentage/Months_In_Years;

        System.out.println("Period(Years)= ");
        byte years = scanner.nextByte();
        int numberOfInstallments = years * Months_In_Years;

        double mortgage = Principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfInstallments))
                          /(Math.pow(1 + monthlyInterest, numberOfInstallments)- 1);
        NumberFormat numFormat = NumberFormat.getCurrencyInstance();
        System.out.println("mortgage= " + numFormat);


        }
}
