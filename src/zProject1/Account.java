package zProject1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormate = new DecimalFormat("'₹'###,##0.00");

    // Set the customer number
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    // Get the customer number
    public int getCustomerNumber() {
        return customerNumber;
    }

    // Set the Pin Number
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    // Get the pin number
    public int getPinNumber() {
        return pinNumber;
    }

    // Get Checking Account Balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Get Saving Account Balance
    public double getSavingBalance() {
        return savingBalance;
    }

    // Calculate checking Account Withdrawal
    public void calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
    }

    // Calculate Saving Account Withdrawal
    public void calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
    }

    // Calculate checking Account deposit
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    // Calculate Saving Account deposit
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    // Customer  checking account withdraw input
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormate.format(checkingBalance));
        System.out.println("Amount you want to withdraw from your Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + checkingBalance + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    // Customer saving account withdraw input
    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormate.format(savingBalance));
        System.out.println("Amount you want to withdraw from your Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + savingBalance + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
    // Customer  checking account Deposite input
    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormate.format(checkingBalance));
        System.out.println("Amount you want to deposit from your Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + checkingBalance + "\n");
        }
        else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    // Customer saving account withdraw input
    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + moneyFormate.format(savingBalance));
        System.out.println("Amount you want to Deposit from your Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + savingBalance + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
}