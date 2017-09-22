package com.JavaUdemy;

import java.util.HashMap;

/**
 * Created by Harmandeep on 14-05-2017.
 */
public class DeluxHamburger extends Hamburgers{

    public DeluxHamburger(String patty, String breadType, int maxAddOns) {
        super(patty, breadType, maxAddOns);
    }

    @Override
    public void addAdditionals(HashMap<Integer, HashMap<String, Double>> additionals) {
        super.addAdditionals(additionals);
    }
}
