package com.company;

public class Main {

    public static void main(String[] args) {
        String ch = "ab";

	switch (ch.toUpperCase()){
        case "A":
            System.out.println("Case A");
            break;

        case "B":
            System.out.println("Case B");
            break;

        case "C":
            System.out.println("Case C");
            break;

        case "D":
            System.out.println("Case D");
            break;

        case "E":
            System.out.println("Case E");
            break;

        default:
            System.out.println("Default case");


    }
    int number = 10111;
	if(isPrime(number)){
        System.out.println(number + " is Prime Number.");
    }
    else{
        System.out.println(number + " is not Prime Number");
    }
    }

    public static boolean isPrime(double n){
        if(n == 1){
            return false;
        }
        for (int i = 2;i<Math.sqrt(n);i++){
            System.out.println("Looping " + i);
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
