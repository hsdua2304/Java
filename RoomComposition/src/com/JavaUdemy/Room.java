package com.JavaUdemy;

/**
 * Created by harmdua on 5/7/2017.
 */
public class Room {
    private Window theWindow;
    private Floor theFloor;

    public Room(Window theWindow, Floor theFloor) {
        this.theWindow = theWindow;
        this.theFloor = theFloor;
    }

    public Window getTheWindow() {
        return theWindow;
    }

    public Floor getTheFloor() {
        return theFloor;
    }
}
