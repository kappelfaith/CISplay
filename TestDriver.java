package JavaPrograms.Homework.HW1.24;

import java.util.Scanner;

public class TestDriver {

    public static void main(String[] s) {
        // Create scanner object to take input
        Scanner in = new Scanner(System.in);
        // declaring the variable
        int choice, amount;
        // creating object
        BankAccount b = new BankAccount();
        // Show message to choose an option
        System.err.print("Choose an option 1. Deposit 2.Withdraw 3. Check Balance 4. Exit=");
        // taking input for choice
        choice = in.nextInt();
        // loop continues unless user enter 4 to exit
        while (choice != 4) {

            if (choice == 1) {// if choice is deposit
                // showing message to user for entering an amount to deposit
                System.out.print("Enter the amount=");
                // taking amount as input
                amount = in.nextInt();
                // call deposit function
                b.deposit(amount);
            } else if (choice == 2) {// if choise is withdraw
                // showing message to user for entering an amount to deposit
                System.out.print("Enter the amount=");
                // taking amount as input
                amount = in.nextInt();
                // call withraw function
                b.withDraw(amount);
            } else if (choice == 3) {// if choice is to check balance
                System.out.println(b.getTotal());
            } else {// show message to user if he enters choice other than specified
                System.out.println("Choice is not valid, Choose again");
            }
            // asking user for new operation
            System.err.print("Choose an option 1. Deposit 2.Withdraw 3. Check Balance 4. Exit=");
            // taking new choice
            choice = in.nextInt();
        }
    }
}
