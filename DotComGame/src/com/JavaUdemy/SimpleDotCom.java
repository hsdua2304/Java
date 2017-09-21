package com.JavaUdemy;

import java.util.ArrayList;

/**
 * Created by Harmandeep on 02-05-2017.
 */
public class SimpleDotCom {
    //int[] locationCells;
    //int numOfHits = 0;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkDotCom(String guess){
        //int userGuess = Integer.parseInt(guess);
        String result = "miss";
        int index = locationCells.indexOf(guess);
        if(index>=0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Kill";
            } else {
                result = "Hit";
            }
        }
        return result;
    }
}
