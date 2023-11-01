package JavaPrograms.Homework.HW1.24;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Withdraw extends BankAccount {
    @Override
    public void deposit(int amt) {
        if (amt < 0) {
            try {
                throw new BankAccountException("Amount is not valid");
            } catch (BankAccountException ex) {
                System.out.println(ex);
            }
        } else {
            balance = balance + amt;
        }
    }

    // method to withdraw money from the account
    @Override
    public void withDraw(int amt) {
        if (balance < amt || amt < 0) {
            try {
                // throwing exception
                throw new BankAccountException("Either Amount is invalid or you have no balance in your account");
            } catch (BankAccountException ex) {
                System.out.println(ex);
            }
        } else {

            balance = balance - amt;
        }

    }
}
