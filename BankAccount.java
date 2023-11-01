package JavaPrograms.Homework.HW1.24;

public class BankAccount {
    int balance;

    public BankAccount() {
        balance = 0;
    }

    public int getTotal() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withDraw(int amount) {
        balance = balance - amount;
    }
}
