package com.JavaUdemy;

import java.util.*;

/**
 * Created by Harmandeep on 14-05-2017.
 */
public class Hamburgers {

    private String breadType;
    private String patty;
    private double price;
    private int maxAddOns;

    public Hamburgers(String patty,String breadType,int maxAddOns){
        this.breadType = breadType;
        this.patty = patty;
        this.price = 5;
        this.maxAddOns = maxAddOns;
    }

    public void addAdditionals(HashMap<Integer,HashMap<String,Double>> additionals){
        double addOnPrice = 0;
        System.out.println("Choose from the following Additions(max " + this.maxAddOns + ") : ");
        for(Map.Entry m:additionals.entrySet()){
            System.out.println(m.getKey() + ". " + m.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        for(int k = 0; k < maxAddOns; k++){
            int j = scanner.nextInt();
            for(HashMap.Entry m : additionals.get(j).entrySet()){
                addOnPrice += Double.parseDouble(m.getValue().toString());
            }
        }
        calculatePrice(addOnPrice);
    }

    public void calculatePrice(double addOnPrice){
        double totalPrice = this.price + addOnPrice;
        System.out.println("Total Cost of : " + this.patty + " " +
                this.breadType + " Hamburger : $" + totalPrice);
    }
}
