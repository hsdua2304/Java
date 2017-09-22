package com.JavaUdemy;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// This code will set sort the array in descending order.
        System.out.println("Enter the number of Integers you want : " );
        int number = scanner.nextInt();
        int[] myArray = getArray(number);
        printArray(myArray);
        int[] sortedArray = sort(myArray);
        printArray(sortedArray);

    }

    public static int[] getArray(int number){
        int[] tempArray = new int[number];
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer : \r");
        for(int i = 0 ; i < tempArray.length ; i++){
            tempArray[i] = scanner.nextInt();
        }
        return tempArray;
    }

    public static void printArray(int[] array){
        System.out.print("Required array : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static int[] sort(int[] array){
        int temp;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        System.out.println("After Sorting\n");
        return array;
    }
}
