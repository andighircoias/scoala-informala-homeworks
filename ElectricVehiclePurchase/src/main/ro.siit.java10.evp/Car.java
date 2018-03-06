package Cars;


import java.util.*;

public class Car {
    private int numberOfOwnersBefore;
    private int motorKW;
    private int batteryKW;
    private int consumpion;
    private String manufacturer;
    private String model;
    private int year;
    private int price;
    private int stock;


    public Car(int motorKW, int batteryKW, int consumpion, String manufacturer, String model, int year, int price, int stock, int numberOfOwnersBefore) {

        this.motorKW = motorKW;
        this.batteryKW = batteryKW;
        this.consumpion = consumpion;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.stock = stock;
        this.numberOfOwnersBefore = numberOfOwnersBefore;
    }


    public int getNumberOfOwners() {
        return numberOfOwnersBefore;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getStock() {
        return stock;
    }
    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}

