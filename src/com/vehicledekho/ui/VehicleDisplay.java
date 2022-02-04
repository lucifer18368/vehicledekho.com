package com.vehicledekho.ui;
import com.vehicledekho.data.*;
import java.util.ArrayList;
import com.vehicledekho.*;
 
public class VehicleDisplay {
    public static void displayVehicle(ArrayList <Vehicle> vehicles){
        for(Vehicle vehicle: vehicles){
            System.out.println("Model: " + vehicle.getmodel());
            System.out.println("Price: " + vehicle.getprice());
            System.out.println("Mileage: " + vehicle.getmileage());
            System.out.println("Tyre type is : " + vehicle.getTyretype());
            
            

        if(vehicle instanceof Bike){
            Bike bike = (Bike) vehicle;
            System.out.println("number of gears: " + bike.getnumberOfGears());
            System.out.println("Power of bike is: " + bike.getpower());
            System.out.println("Brakes of bike is: " + bike.getBrakes());
        }
        if(vehicle instanceof Car){
            Car car = (Car) vehicle;
            System.out.println("Brand of car is: " + car.getbrand());
            System.out.println("category is: " + car.getcategory());
            System.out.println("Transmission of car is: " + car.getTransmission());
            

        }

        System.out.println("------------------------------------");

        }
    }
}
