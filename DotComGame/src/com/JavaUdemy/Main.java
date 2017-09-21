package com.JavaUdemy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numOfGuess  = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);  //To get number between 0 to 4 we are multiplying with 5.
        int[] locationCells = {randomNum,randomNum+1,randomNum+2};

        dot.setLocationCells(ArrayList<String> locationCells);
        boolean isAlive = true;

        while(isAlive){
            String guess = helper.getUserInput("Enter a number");
            String result = dot.checkDotCom(guess);
            System.out.println(result);
            numOfGuess++;

            if(result == "kill"){
                isAlive = false;
                System.out.println("Number of guess = " + numOfGuess);
            }
        }
    }
}
5