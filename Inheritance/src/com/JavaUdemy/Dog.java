package com.JavaUdemy;

/**
 * Created by Harmandeep on 26-04-2017.
 */
public class Dog extends Animal {
    private String coat;
    private int eyes;
    private String tail;

    public Dog(int size, String name, int legs, String type, int brain) {
        super(size, name, legs, type, 1);
    }

    public void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }
}
