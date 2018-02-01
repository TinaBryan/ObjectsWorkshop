package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

     //create a new class Cat
//         when the variables are written they have to be in the same order as they were created within the class
        Cat cat = new Cat(4, true, "Calico");

        System.out.println(cat.getColor());

        Pencil pencil = new Pencil(.7, "Dixion", true, "Orange", false);
        Pencil pencil1 = new Pencil(.5, "PaperMate", false, "Yellow", true);

        System.out.println("This is pencil: " + pencil.getColor());
        System.out.println("This is pencil: " + pencil.getBrand());
        System.out.println("This is pencil: " + pencil1.getBrand());
        System.out.println("This is pencil: " + pencil1.getLeadSize());

    }
}
