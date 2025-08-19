package com.mycompany.oopdemo;

// ----------------------------------------------------------------------------------------
// Inheritance:     This child class inherits all of the attributes and methods of the parent class.
// Polymorphism:    Poly = mutliple, Morph = forms; A class that takes mutiple forms.
//                  Overriding methods are common in abstract classses and polymorphism.
// ----------------------------------------------------------------------------------------

public class Car extends Vehicle{
    
    public Car(String brand, String model, int year) {
        // Calls Vehicle's constructor
        super(brand, model, year);
    }
    
    // Overriding the parent's abstract method.
    @Override
    public void run() {
        System.out.println("The car starts running.....");
    }
}