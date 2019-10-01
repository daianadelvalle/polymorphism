package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {
    //attr
    private Integer rpm;
    //constructors
    public SportsVehicle() {}
    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }
    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }
    //getter and setter
    public Integer getRpm() {
        return rpm;
    }
    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }
    //methods
    @Override
    public String technicalSheet() {
        if (rpm <= 50) {
            return "Vehiculo deportivo: " + "Ficha técnica: " + this.toString() + " [El auto es muy bonito, pero solo sirve para ir a pasear] ";
        } else if ( rpm >= 51 && rpm <= 300 ) {
            return "Vehiculo deportivo: " + "Ficha técnica: " + this.toString() + " [Con este auto puedes desafiar a cualquiera en la pista] ";
        } else if ( rpm >= 301 && rpm <= 600 ) {
            return "Vehiculo deportivo: " + "Ficha técnica: " + this.toString() +  " [Si tienes este auto, debe considerar participar en NASCAR] ";
        } else {
            return "Vehiculo deportivo: " + "Ficha técnica: " + this.toString() +  " [¿Eres parte del elenco de rápidos y furiosos?] ";
        }
    }
    @Override
    public String toString() {
        return "marca: " + this.brand + "modelo: " + this.model + "Año: " + this.year;
    }
    @Override
    public int hashCode() {
        return -25 * Objects.hash(this.rpm);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj ) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        SportsVehicle that = (SportsVehicle) obj;
        return this.rpm.equals(that.rpm);
    }



}
