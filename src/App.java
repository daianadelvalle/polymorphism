import ar.com.ada.collision.subclass.ElectricalVehicle;
import ar.com.ada.collision.subclass.SportsVehicle;
import ar.com.ada.collision.subclass.Truck;
import ar.com.ada.collision.superclass.Vehicle;

import java.beans.FeatureDescriptor;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehiculos = new Vehicle[12];

        vehiculos[0] = new Vehicle("Renault, ", "Sandero, ", 2015 );
        vehiculos[1] = new Vehicle("Ford, ", "Ka, ", 2000 );
        vehiculos[2] = new Vehicle("Peugeot, ", "207, ", 2018 );
        vehiculos[3] = new ElectricalVehicle("Tesla, ", "Model 3, ", 2010, 120);
        vehiculos[4] = new ElectricalVehicle("Audi, ", "e-tron, ", 2018, 130);
        vehiculos[5] = new ElectricalVehicle("Jaguar, ", "I-PACE, ", 2017, 150);
        vehiculos[6] = new SportsVehicle("Ferrari, ", "Testarossa, ", 2018, 6000);
        vehiculos[7] = new SportsVehicle("Chevrolet, ", "Camaro, ", 2016, 400);
        vehiculos[8] = new SportsVehicle("Ford, ", "Mustang, ", 2019, 550);
        vehiculos[9] = new Truck("Mercedes-Benz, ", "Axor 2541, ", 2018, 225);
        vehiculos[10] = new Truck("Iveco, ", "2000, ", 2014, 50);
        vehiculos[11] = new Truck("Scania, ", "XT, ", 2018, 75);


        // for
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(" Vehiculo " + i + " valor: " + vehiculos[i].technicalSheet());

        }




    }
}
