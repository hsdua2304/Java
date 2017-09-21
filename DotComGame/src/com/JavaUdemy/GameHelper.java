package com.JavaUdemy;

import java.io.*;

/**
 * Created by Harmandeep on 02-05-2017.
 */
public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }
        }
        catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
