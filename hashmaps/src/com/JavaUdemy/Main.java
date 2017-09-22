package com.JavaUdemy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, HashMap<String,Double>> hashmap = new HashMap<Integer,HashMap<String,Double>>();
        hashmap.put(1,new HashMap<>());
        hashmap.put(2,new HashMap<>());
        hashmap.put(3,new HashMap<>());
        hashmap.put(4,new HashMap<>());
        hashmap.put(5,new HashMap<>());
        hashmap.put(6,new HashMap<>());
        hashmap.put(7,new HashMap<>());
        hashmap.put(8,new HashMap<>());
        hashmap.put(9,new HashMap<>());
        hashmap.get(1).put("Lattice", 0.5);
        hashmap.get(2).put("Onions", 0.8);
        hashmap.get(3).put("Tomato",1.2);
        hashmap.get(4).put("Carrot",1.1);
        hashmap.get(5).put("Cucumber",1.4);
        hashmap.get(6).put("Jalapenos",2.0);
        hashmap.get(7).put("Red Paprika",1.8);
        hashmap.get(8).put("Black Olives",2.4);
        hashmap.get(9).put("Sweet Corn",1.5);
        //System.out.println(hashmap.get(1).values());
        //String d = hashmap.get(2).getAtIndex();
        //System.out.println(d);
        for(HashMap.Entry m : hashmap.get(2).entrySet()){
            System.out.println(m.getValue());
        }


    }

}
