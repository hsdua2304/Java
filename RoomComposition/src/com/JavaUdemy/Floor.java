package com.JavaUdemy;

/**
 * Created by harmdua on 5/7/2017.
 */
public class Floor {
    private Dimensions dimensions;
    private String floorType;

    public Floor(Dimensions dimensions, String floorType) {
        this.dimensions = dimensions;
        this.floorType = floorType;
    }

    public String getFloorType() {
        return floorType;
    }
}
