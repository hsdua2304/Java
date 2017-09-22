package com.JavaUdemy;

/**
 * Created by harmdua on 5/7/2017.
 */
public class Window {
    private Dimensions dimensions;
    private boolean state;

    public Window(boolean type, Dimensions dimensions){
        this.dimensions = dimensions;
        this.state = state;
    }

    public void changeWindowState(boolean state) {
        if (!state) {
            this.state = false;
            System.out.println("Window is Closed now");
        } else {
            this.state = true;
            System.out.println("Window is Opened now");
        }
    }

    public Dimensions getDimensions() {
        float length = dimensions.getLength();
        float width = dimensions.getWidth();
        System.out.println(length + " ' " + width + " '.");
        return dimensions;
    }

    public boolean getState() {
        return state;
    }
}
