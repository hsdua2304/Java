package com.JavaUdemy;

/**
 * Created by Harmandeep on 26-04-2017.
 */
public class Animal {
    private int size;
    private String name;
    private int legs;
    private String type;
    private int brain;

    public Animal(int size, String name, int legs, String type,int brain) {
        this.size = size;
        this.name = name;
        this.legs = legs;
        this.type = type;
        this.brain = brain;
    }
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        return type;
    }
}
