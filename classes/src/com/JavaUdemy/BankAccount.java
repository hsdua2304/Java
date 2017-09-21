package com.JavaUdemy;

/**
 * Created by harmdua on 4/17/2017.
 */
public class BankAccount {
    private String accountNum;
    private String name;
    private String email;
    private String phoneNum;
    private double balance;

    public BankAccount(){
        this("12345","BobMarley","bob@gmail.com","9711123456",50);
        System.out.println("Empty Constructor");
    }
    public BankAccount(String accountNum,String name,String email,String phoneNum,double balance){
        setAccountNum(accountNum);
        setEmail(email);
        setName(name);
        setPhoneNum(phoneNum);
        setBalance(balance);
    }
    public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getAccountNum(){
        return this.accountNum;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double balance){
        this.balance += balance;
        System.out.println("Current Balance = " + this.balance);
    }
    public void withdraw(double balance){
        if(this.balance < balance){
            System.out.printf("Insufficient funds");
        }
        else {
            this.balance -= balance;
            System.out.println("Amount withdrawn = " + balance +". Current Balance = "+ this.balance);
        }
    }
}

