package com.JavaUdemy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal A1 = new Animal(5,"Animal",1,"Carnivores",1);
        Dog d1 = new Dog(2,"Miller",4,"Herbivores",1);

        d1.eat();
        A1.eat();

    }
}
