/**
 * Created by Deerlet-7 on 2020/6/1 17:39
 */
package javaStudy1;

import javaStuday1.Loan;

import java.util.Scanner;

public class LoanCalculator
{
    private Loan loan;
    public static void main(String[] arg)
    {
        LoanCalculator calculator=new LoanCalculator();
        calculator.start();
    }

    public LoanCalculator()
    {
//loan=new Loan();
    }
    public void start()
    {
        describeProgram();
        getInput();
        computerPayment();
        displayOutput();
    }
    private void getInput()
    {
        double loanAmount,annualInterestRate;
        int loanPeriod;
        Scanner scanner = new Scanner( System.in);
        System.out.print("Loan Amount:");
        loanAmount=scanner.nextDouble();
        System.out.print("Annual Interest Rate(e.g,9.5):");
        annualInterestRate=scanner.nextDouble();
        System.out.print("Loan Period:");
        loanPeriod=scanner.nextInt();
        loan=new Loan(loanAmount,annualInterestRate,loanPeriod);
        System.out.println("LoanAmount:$"+loan.getAmount());
        System.out.println("annualInterestRate"+loan.getRate()+"%");
        System.out.println("Loan Period:$"+loan.getPeriod());
        scanner.close();
    }

    private void displayOutput()
    {

        System.out.println("Loan Amount: $" + loan.getAmount());
        System.out.println("Annual Interest Rate:" + loan.getRate() + "%");
        System.out.println("Loan Period (years): " + loan.getPeriod());
        System.out.println("Monthly payment is $ "+loan.getMonthlyPayment());
        System.out.println("Total payment is $ "+loan.getTotalPayment());
    }
    private void computerPayment()
    {
        System.out.println("inside computePayment");
    }
    private void describeProgram()
    {
        System.out.println ("This program computes the monthly and total");
        System.out.println ("payments for a given loan amount, annual ");
        System.out.println ("interest rate, and loan period (# of years).");
        System.out.println("\n");
    }

}
