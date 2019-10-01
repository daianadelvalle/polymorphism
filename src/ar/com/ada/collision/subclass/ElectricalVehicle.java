package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    //attr
    private Integer potency;
    //constructors
    public ElectricalVehicle() {
    }
    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }
    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;
    }
    //getter and setter
    public Integer getPotency() {
        return potency;
    }
    public void setPotency(Integer potency) {
        this.potency = potency;
    }
    //methods
    @Override
    public String technicalSheet() {
        if (this.year < 2007) {
            return "Vehiculo electrico: " + " [No existe modelo para este año] ";
        } else {
            return "Vehiculo electrico: " + "Ficha técnica: " + this.toString() + " [Es un año de última tecnología!]";
        }
    }
    @Override
    public String toString() {
        return "marca: " + this.brand + "modelo: " + this.model + "Año: " + this.year + this.potency;
    }
    @Override
    public int hashCode() {
        return -25 * Objects.hash(this.potency);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) obj;
        return this.potency.equals(that.potency);
    }

}
