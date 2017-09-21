package com.JavaUdemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car i20 = new Car();
        //System.out.println("I20(" + i20.getModel() + ")" );
        i20.setModel("Asta");
        System.out.println("I20(" + i20.getModel() + ")" );
        //System.out.println(i20.model);

        BankAccount B1 = new BankAccount();
        System.out.println(B1.getName());
        System.out.println(B1.getAccountNum());
        System.out.println(B1.getBalance());
        B1.deposit(200);
        B1.withdraw(100);
        System.out.println(B1.getBalance());
        BankAccount B2 = new BankAccount();
        System.out.println(B2.getAccountNum());
        System.out.println(B2.getName());
        System.out.println(B2.getBalance());

        //VipCustomer Class

        VipCustomer V1 = new VipCustomer();
        System.out.println(V1.getName());
        VipCustomer V2 = new VipCustomer("Sunny","Sunny@gmsil.com");
        System.out.println(V2.getName());
        VipCustomer V3 = new VipCustomer("Rohan","Rohsn@gmail.com",230);
        System.out.println(V3.getName());

    }
}