package com.example.oop;

public class Account {

    private int accountNo;
    private String name;
    private float amount;

    public void insert(
            int accountNo,
            String name,
            float amount
    ) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    public void deposit(
            float amount
    ) {
        this.amount += amount;
        System.out.println("deposited");
    }

    public void withdraw(
            float amount
    ) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("withdrawn");

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Balance = " + this.amount);
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + "]";
    }

}
