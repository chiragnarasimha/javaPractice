package com.chirag.learnJava.OOPChallenges;

public class Account {
    private String customerName, email;
    private int number, phoneNumber;
    private double balance;

    public Account(String customerName, String email, int number, int phoneNumber, double balance) {
        this.customerName = customerName;
        this.email = email;
        this.number = number;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public Account(String customerName, String email) {
        this(customerName, email, 11111111, 1000000000, 0);
    }

    public Account(String customerName, String email, int number) {
//        this.customerName = customerName;
//        this.email = email;
//        this.number = number;
        this(customerName, email, number, 1000000000, 0);
    }

    public Account(String customerName, String email, int number, int phoneNumber) {
        this(customerName, email, number, phoneNumber, 0);
    }

    public void depositAmount(double amountToDeposit) {
        this.balance += amountToDeposit;
        System.out.println("Amount deposited successfully. Your new balance is: " + this.balance);
    }

    public void withdrawFunds(double amountToWithdraw) {
        if (this.balance >= amountToWithdraw) {
            this.balance -= amountToWithdraw;
            System.out.println(amountToWithdraw + "was withdrawn. New Balance = " + this.balance);

        }
        else {
            System.out.println("Insufficient Funds. Available Balance: " + this.balance);
        }

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
