package com.JavaUdemy;

import java.util.Scanner;

/**
 * Created by Harmandeep on 29-05-2018.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String args[]){
        boolean quit = false;
            printChoiceList();

            while(!quit){
                System.out.print("Enter your choice : ");
                int choice = scanner.nextInt();
                scanner.nextLine();
            switch (choice) {
                case 0:
                    printChoiceList();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    groceryList.printItem();
                    break;
                case 3:
                    System.out.print("Enter the position : ");
                    int position = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Item to be modified : ");
                    String item = scanner.nextLine();
                    groceryList.modifyItem(position-1,item);
                    break;
                case 4:
                    System.out.print("Enter position : ");
                    System.out.println(groceryList.removeItem(scanner.nextInt()) + " is been removed");
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }


    }

    public static void printChoiceList(){
        System.out.println("0 : Print choice List");
        System.out.println("1 : Add Items");
        System.out.println("2 : Print Items");
        System.out.println("3 : Modify Items");
        System.out.println("4 : Remove Items");
        System.out.println("5 : Find Item");
        System.out.println("6 : Quit");
    }

    public static void addItem(){
        System.out.print("Enter the item you want to add : ");
        groceryList.addItem(scanner.nextLine());
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

}
