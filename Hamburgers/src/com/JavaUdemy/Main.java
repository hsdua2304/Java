package com.JavaUdemy;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, HashMap<String,Double>> additionals = new HashMap<Integer,HashMap<String,Double>>();
            additionals.put(1,new HashMap<>());
            additionals.put(2,new HashMap<>());
            additionals.put(3,new HashMap<>());
            additionals.put(4,new HashMap<>());
            additionals.put(5,new HashMap<>());
            additionals.put(6,new HashMap<>());
            additionals.put(7,new HashMap<>());
            additionals.put(8,new HashMap<>());
            additionals.put(9,new HashMap<>());
            additionals.get(1).put("Lattice", 0.5);
            additionals.get(2).put("Onions", 0.8);
            additionals.get(3).put("Tomato",1.2);
            additionals.get(4).put("Carrot",1.1);
            additionals.get(5).put("Cucumber",1.4);
            additionals.get(6).put("Jalapenos",2.0);
            additionals.get(7).put("Red Paprika",1.8);
            additionals.get(8).put("Black Olives",2.4);
            additionals.get(9).put("Sweet Corn",1.5);
        //Hamburgers burger = new Hamburgers("Veg");
        //burger.addAdditionals(additionals);

        DeluxHamburger deluxHamburger = new DeluxHamburger("Non-Veg","Oregano",6);
        deluxHamburger.addAdditionals(additionals);
        }

    }