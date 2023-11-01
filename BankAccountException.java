package JavaPrograms.Homework.HW1.24;

public class BankAccountException extends Exception {
    // variable declaration
    String str;
    int balance;

    // constructor
    public BankAccountException(String st) {
        str = st;
    }

    @Override
    public String toString() {
        return str; // show error message
    }

    public void deposit(int amount) {
        if (amount < 0) {
            try {
                throw new BankAccountException("Amount is not valid");
            } catch (BankAccountException ex) {
                System.out.println(ex);
            }
        } else {
            balance = balance + amount;
        }
    }

    // method to withdraw money from the account
    @Override
    public void withDraw(int amount) {
        if (balance < amount || amount < 0) {
            try {
                // throwing exception
                throw new BankAccountException("Either Amount is invalid or you have no balance in your account");
            } catch (BankAccountException ex) {
                System.out.println(ex);
            }
        } else {

            balance = balance - amount;
        }

    }

}
