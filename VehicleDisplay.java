package com.vehicledekho.ui;
import java.util.ArrayList;
import com.vehicledekho.*;
 
public class VehicleDisplay {
    public static void displayVehicle(ArrayList <Vehicle> vehicles){
        for(Vehicle vehicle: vehicles){
            System.out.println("Model: " + vehicle.getmodel());
            System.out.println("Price: " + vehicle.getprice());
            System.out.println("Mileage: " + vehicle.getmileage());
            
            

        if(vehicle instanceof Bike){
            Bike bike = (Bike) vehicle;
            System.out.println("number of gears: " + bike.getnoofGears());
            System.out.println("Power of bike is: " + bike.getpower());
        }
        if(vehicle instanceof Car){
            Car car = (Car) vehicle;
            System.out.println("Brand of car is: " + car.getbrand());
            System.out.println("category is: " + car.getcategory());
            

        }

        System.out.println("------------------------------------");

        }
    }
}
