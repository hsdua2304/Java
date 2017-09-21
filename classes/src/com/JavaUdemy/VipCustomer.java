package com.JavaUdemy;

/**
 * Created by Harmandeep on 18-04-2017.
 */
public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer(){
        this("Default Name","Default@default.com",0);
    }
    public VipCustomer(String name,String email){
        this(name,email,230);
    }
    public VipCustomer(String name,String email,double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
