package com.vehicledekho.main;
import java.util.ArrayList;
import com.vehicledekho.data.*;
import com.vehicledekho.ui.*;

public class Main {

	public static void main(String[] args) {
		Bike bike = new Bike();
        bike.setmodel("hayabusa");
        bike.setmileage(55);
        bike.setprice(120000);
        bike.settype("sports");
        bike.setpower(200);
        bike.setnumberOfGears("5");
        bike.setBrakes("Disk Brakes");
        bike.setTyretype("Tubeless");

        Car car = new Car();
        car.setbrand("Ducati");
        car.setmodel("Ver");
        car.setmileage(12);
        car.setprice(1000000);
        car.setcategory("Offroad");
        car.setTransmission("Auto");
        car.setTyretype("Tubed");


        ArrayList <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bike);
        vehicles.add(car);

        VehicleDisplay.displayVehicle(vehicles);
	}

}
