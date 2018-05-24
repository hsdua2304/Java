package com.JavaUdemy;

import java.util.ArrayList;

public class Main {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void printItem(){
        System.out.println("You have " + groceryList.size() + " item in your GroceyList.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    public void modifyItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + position+1 + " has been modified.");
    }

    public void removeItem(int position){
        String removedItem = groceryList.get(position);
        groceryList.remove(position);
    }



    public static void main(String[] args) {
	// write your code here


    }
}
