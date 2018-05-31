package com.JavaUdemy;
/**
 * Created by harmdua on 4/26/2017.
 */
public class Vehicle {
    private String type;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String type,String size){
        this.type = type;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0
    }

    public void stop(){
        this.currentVelocity = 0;
    }
    public void setCurrentVelocity(int speed){
        this.currentVelocity += speed;
    }

    public int getCurrentVelocity(){
        return this.currentVelocity;
    }

    public void move(int speed,int direction){
        this.currentVelocity = speed;
        this.currentDirection = direction;
        System.out.println("Vehicle.move() Vehicle moving at " + speed + " Km/Hr and direction = "+ direction + "degrees");
    }

    public void steer(int degree){
        this.currentDirection = degree;
    }
     public String getType(){
        return this.type;
     }

     public String getSize(){
         return this.size;
     }
}
