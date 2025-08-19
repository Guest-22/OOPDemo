package com.mycompany.oopdemo;

    // ----------------------------------------------------------------------------------------
    // Abstraction: Shows the essential features only.
    //              It cannot be instantiated.
    //              Is a template or placeholder for the child class.
    //              All child class must implement all of the attributes and methods within the abstract parent class
    // ----------------------------------------------------------------------------------------

public abstract class Vehicle {
    
    // ----------------------------------------------------------------------------------------
    // Encapsulation:   The process of hiding details using the private keyword.
    //                  Private variables are only accessible within this class.
    //                  Can be accessed using the Setter & Getter method.
    // ----------------------------------------------------------------------------------------
    
    private String brand;
    private String model;
    private int year;
    
    
    // Constructor
    public Vehicle (String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    
    // Abstract method: a template to be overriden by the child class; a common  to all child classes.
    public abstract void run();
    
    
    // Getter method:   returns the values of the ff. variables.
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    

    // Setter method:   sets/overwrites the values of the ff. variables.
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    } 
}