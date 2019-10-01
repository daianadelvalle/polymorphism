package ar.com.ada.collision.superclass;

import java.util.Objects;

public class Vehicle {
    //attr
    protected String brand;
    protected String model;
    protected Integer year;
    //constructors
    public Vehicle() {
    }
    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    //getter and setter
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    //methods
    public String technicalSheet() {
       return "Vehículo simple " +
               "" + "Ficha técnica: " + this.toString() + " " +
               " [Este vehículo no tiene categoría asignada] ";
    }
    //overwriting
    @Override
    public String toString() {
        return "marca: " + this.brand + "modelo: " + this.model + "Año: " + this.year;
    }
    @Override
    public int hashCode() {
        return -25 * Objects.hash(this.brand, this.model, this.year);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Vehicle that = (Vehicle) obj;
        return this.brand.equals(that.brand) &&
                this.model.equals(that.model) &&
                this.year.equals(that.year);
    }
}
