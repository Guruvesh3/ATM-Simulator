package atm_project;
import java.util.*;
import java.text.*;

class Account {

    Scanner sc = new Scanner(System.in);
    DecimalFormat DF = new DecimalFormat("' Rs. '###,##0.00");

    private int CN;
    void setCustomerNumber(int a) {
        CN = a;
        System.out.println("The Customer Number is: " + CN);
    }

    private int PIN;
    void setPINNumber(int b) {
        PIN = b;
        System.out.println("The PIN Number is: " + PIN);
    }

    double CB = 200000;
    void getCurrentBalance() {
        System.out.println(DF.format(CB));
    }

    double SB = 5000000;
    void getSavingsBalance() {
        System.out.println(DF.format(SB));
    }

    void getCurrentWithdrawInput() {
        System.out.println("Enter the amount you want to withdraw: ");
        double WithdrawAmount = sc.nextDouble();
        if ((CB - WithdrawAmount) >= 0) {
            calcCurrentWithdraw(WithdrawAmount);
            System.out.println("Transaction Successful");
            System.out.println("The account balance is: " + DF.format(CB));
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void getSavingsWithdrawInput() {
        System.out.println("Enter the amount you want to withdraw: ");
        double WithdrawAmount2 = sc.nextDouble();
        if ((SB - WithdrawAmount2) >= 0) {
            calcSavingsWithdraw(WithdrawAmount2);
            System.out.println("Transaction Successful");
            System.out.println("The account balance is: " + DF.format(SB));
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    double calcCurrentWithdraw(double Amount) {
        CB = CB - Amount;
        return CB;
    }

    double calcSavingsWithdraw(double Amount) {
        SB = SB - Amount;
        return SB;
    }

    void getCurrentDeposit() {
        double Deposit;
        System.out.println("Enter the Amount to deposit: ");
        Deposit =  sc.nextDouble();
        if(Deposit <= 0) {
            System.out.println("Input invalid");
        }
        else {
            CB = CB + Deposit;
        }
    }

    void getSavingsDeposit() {
        double Deposit;
        System.out.println("Enter the Amount to deposit: ");
        Deposit =  sc.nextDouble();
        if(Deposit <= 0) {
            System.out.println("Input invalid");
        }
        else {
            SB = SB + Deposit;
        }
    }

    int getCustomerNumber() {
        return CN;
    }

    int getPINNumber() {
        return PIN;
    }

}

class OptionMenu extends Account {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    void GetLogin() {
        try {
            data.put(10001, 2521);
            data.put(10002, 2522);
            data.put(10003, 2523);
            data.put(10004, 2524);
            data.put(10005, 2525);
            data.put(10006, 2526);
            data.put(10007, 2527);
            data.put(10008, 2528);

            System.out.println("Welcome to the ATM.");

            System.out.print("Please enter the Customer Number: ");
            setCustomerNumber(sc.nextInt());

            int P = getCustomerNumber();

            System.out.print("Enter the PIN Number: ");
            setPINNumber(sc.nextInt());

            int Q = getPINNumber();

            if (data.containsKey(P) && data.get(P) == Q) {
                System.out.println("Login Successful");
                getAccountType();
            } else {
                System.out.println("PIN or Customer number is incorrect");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Only numbers are allowed");
            System.out.println("Characters and symbols are not allowed");
            sc.next();
            GetLogin();
        }
    }

    void getAccountType() {
        System.out.println("Please select the Account Type to access: ");
        System.out.println("Type 1: Current Account");
        System.out.println("Type 2: Savings Account");
        System.out.println("Type 3: Exit");
        System.out.print("\nChoice: ");
        int Choice = sc.nextInt();
        switch (Choice) {
            case 1:
                System.out.println("The selected account type is: Current");
                getCurrent();
                break;

            case 2:
                System.out.println("The selected account type is: Savings");
                getSavings();
                break;

            case 3:
                System.out.println("Thank you for visiting");
                System.out.println("Visit Again!");
                break;

            default:
                System.out.println("Invalid Choice! Try Again: ");
                getAccountType();
                break;
        }
    }

    void getCurrent() {
        System.out.println("Current Account");
        System.out.println("Type 1: Check Balance");
        System.out.println("Type 2: Deposit Money");
        System.out.println("Type 3: Withdraw money");
        System.out.println("Type 4: Exit");
        System.out.println("Choice: ");
        int Choice2 = sc.nextInt();
        switch (Choice2) {
            case 1:
                System.out.println("The current balance is: ");
                getCurrentBalance();
                getAccountType();
                break;
            case 2:
                System.out.println("Kindly deposit the money");
                getCurrentDeposit();
                System.out.println("The money has been deposited!");
                getAccountType();
                break;
            case 3:
                getCurrentWithdrawInput();
                System.out.println("Kindly collect your money");
                getAccountType();
                break;
            case 4:
                System.out.println("Exited!");
                break;
            default:
                System.out.println("Invalid input");
                System.out.println("Try Again: ");
                getCurrent();
                break;
        }
    }

    void getSavings() {
        System.out.println("Savings Account");
        System.out.println("Type 1: Check Balance");
        System.out.println("Type 2: Deposit Money");
        System.out.println("Type 3: Withdraw money");
        System.out.println("Type 4: Exit");
        System.out.println("Choice: ");
        int Choice3 = sc.nextInt();
        switch (Choice3) {
            case 1:
                System.out.println("The balance is: ");
                getSavingsBalance();
                getAccountType();
                break;
            case 2:
                System.out.println("Kindly deposit the money");
                getSavingsDeposit();
                System.out.println("The money has been deposited!");
                getAccountType();
                break;
            case 3:
                getSavingsWithdrawInput();
                System.out.println("Kindly collect your money");
                getAccountType();
                break;
            case 4:
                System.out.println("Exited!");
                break;
            default:
                System.out.println("Invalid input");
                getSavings();
                break;
        }
    }
}

public class ATM extends OptionMenu {
    public static void main(String[] args) {
        do {
            OptionMenu om = new OptionMenu();
            om.GetLogin();
        } while (true);
    }
}
