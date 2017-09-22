package com.JavaUdemy;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dimensions windowDimensions = new Dimensions(14, 10);
        Window theWindow = new Window(false, windowDimensions);
        Dimensions floorDimension = new Dimensions(40, 30);
        Floor theFloor = new Floor(floorDimension, "Wooden");

        Room theRoom = new Room(theWindow,theFloor);
        theRoom.getTheWindow().changeWindowState(true);
        System.out.println("Floor type -> " + theRoom.getTheFloor().getFloorType());
    }
}
