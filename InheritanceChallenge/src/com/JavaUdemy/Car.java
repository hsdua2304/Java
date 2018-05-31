package com.JavaUdemy;

/**
 * Created by harmdua on 4/26/2017.
 */
public class Car extends Vehicle{
    private String name;
    private int tyres;
    private int gear;
    private boolean isMannual;

    private int currentGear;

    public Car(String name,String size,int tyres,int gear,boolean isMannual){
        super("Car",size);
        this.name = name;
        this.tyres = tyres;
        this.gear = gear;
        this.isMannual = isMannual;
        this.currentGear = 0;
    }
    public void setGear(int gear){
        this.gear = gear;
        System.out.println("Current Gear of Car = " + gear  +"\noving at speed of "+ getCurrentVelocity()+ " Km/hr");
    }
    public void changeGear(int gear){
        setGear(gear);
    }

}
