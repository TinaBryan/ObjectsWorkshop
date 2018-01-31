package com.company;
import java.util.Scanner;

public class Cat {
    // create variables defining the elements of the cat
    private int legs;
    private boolean fur;
    private String color;
    private Scanner input = new Scanner(System.in);

    // constructor
    public Cat(int legs, boolean fur, String color) {
        // constructor setting the value for each variable
        this.legs = legs;
        this.fur = fur;
        this.color = color;

    }

    // getters and setters
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
