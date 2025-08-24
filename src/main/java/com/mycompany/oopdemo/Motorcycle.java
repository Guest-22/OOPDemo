package com.mycompany.oopdemo;

// ----------------------------------------------------------------------------------------
// Inheritance:     This child class inherits all of the attributes and methods of the parent class.
// Polymorphism:    Poly = mutliple, Morph = forms; The ability of an object or method to take on many forms.
//                  Overriding methods are common in abstract classses and interfaces.
// ----------------------------------------------------------------------------------------

public class Motorcycle extends Vehicle{
    
    public Motorcycle(String brand, String model, int year) {
        // Calls Vehicle's constructor
        super(brand, model, year);
    }
    
    // Overriding the parent's abstract method.
    @Override
    public void run() {
        System.out.println("The motorcycle starts running.....");
    }
}