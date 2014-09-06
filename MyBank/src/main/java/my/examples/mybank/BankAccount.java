package my.examples.mybank;

/**
 * Created by pgirga on 9/6/2014.
 */

public class BankAccount {

    int accountNumber;

    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    /*
    * to withdraw funds from the account
     */
    public boolean debit(double amount) {
        double newAccountBalance;

        if (amount > balance) {
            //there are not enough funds in the account
            return false;
        } else {
            newAccountBalance = balance - amount;
            balance = newAccountBalance;
            return true;
        }

    }

    /*
    * to credit funds from the account
     */
    public boolean credit(double amount) {
        double newAccountBalance;

        if (amount < 0.0) {
            return false; // can not credit a negative amount
        } else {
            newAccountBalance = balance + amount;
            balance = newAccountBalance;
            return true;
        }

    }
}

