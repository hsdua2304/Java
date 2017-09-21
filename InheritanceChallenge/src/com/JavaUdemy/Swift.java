package com.JavaUdemy;

/**
 * Created by harmdua on 4/27/2017.
 */
public class Swift extends Car {
    private int modelYear;

    public Swift(int year){
        super("Swift","Hatchback",4,5,true);
        this.modelYear = year;
    }
    public void accelerate(int addSpeed){
        setCurrentVelocity(addSpeed);
        int speed = getCurrentVelocity();
        if(speed == 0){
            stop();
        } else if(speed > 0 && speed <= 20){
            changeGear(1);
        }else if(speed > 20 && speed <= 40){
            changeGear(2);
        }else if(speed >40 && speed <= 60){
            changeGear(3);
        }else if(speed >60 && speed <=80){
            changeGear(4);
        }else if(speed > 80 && speed <=120){
            changeGear(5);
        }else{
            System.out.println("You are exceeding the speed limit!!!!");
        }
    }
}
