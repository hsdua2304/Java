package com.JavaUdemy;

class Car{
    private String name;
    private int wheel;
    private int cylinder;
    private boolean engine;

    public Car(String name,int cylinder){
        this.name = name;
        this.cylinder = cylinder;
        this.engine = false;
        this.wheel = 4;
    }

    public void startEngine(){
        if(!getEngine()){
            this.engine = true;
            System.out.println(this.name + "'s Engine is been started");
        }
        else{
            System.out.println(this.name + "'s is already started");
        }
    }
    public boolean getEngine(){
        return this.engine;
    }
    public void accelerate(){
        if(getEngine()){
            System.out.println(this.name + " is accelerating");
        }
        else{
            System.out.println(this.name + "'s Engine is not Started yet!!!!");
        }
    }
    public void pullBreak(){
        System.out.println("Car is stop accelerating");
    }
}

class Swift extends Car{

    public Swift() {
        super("Swift", 4);
    }
}

class Baleno extends Car{
    public Baleno() {
        super("Baleno", 2);
    }
}

public class Main {

    public static void main(String[] args) {

        Swift swift = new Swift();
        I20 i20 = new I20();
        Baleno baleno = new Baleno();

        swift.startEngine();
        swift.accelerate();
        baleno.accelerate();
    }

    static class I20 extends Car{
        public I20() {
            super("I20", 4);
        }
    }
}