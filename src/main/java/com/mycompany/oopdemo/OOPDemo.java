package com.mycompany.oopdemo;

public class OOPDemo {

    public static void main(String[] args) {
        // Note: Since the parent class is an abstract, we can't create an object directly.
        // Vehicle myVehicle = new Vehicle("brand", "model", 2000); // This will throw an error.
        
        
        // Creating a Car object
        Vehicle myCar = new Car("Toyota", "Vios", 2020);
        
        
        // Creating a Motorcycle object
        Vehicle myBike = new Motorcycle("Yamaha", "MT-15", 2022);

        
        // Display the ff. details using the Getter method.
        // Trying to access the variable directly will result to an erorr.
        System.out.println("--------------- Vehicle Inventory ---------------");
        System.out.println("Car: " + myCar.getBrand() + " " + myCar.getModel() + " (" + myCar.getYear() + ")");
        System.out.println("Motorcycle: " + myBike.getBrand() + " " + myBike.getModel() + " (" + myBike.getYear() + ")\n");
        
        
        // Manipulating the value using the Setter method
        myCar.setModel("Corolla");
        myCar.setYear(2024);
        System.out.println("Car: " + myCar.getBrand() + " " + myCar.getModel() + " (" + myCar.getYear() + ")\n");
        
        
        // Polymorphism in action: same method, different behavior.
        myCar.run();
        myBike.run();
        myCar.stop();
        
        // Example of inheritance; not polymorphism.
        myBike.stop();
    }
}