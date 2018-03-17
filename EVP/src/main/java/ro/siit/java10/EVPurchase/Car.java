package ro.siit.java10.EVPurchase;

import static java.lang.Math.abs;

public class Car {
    private int motorKW;
    private int batteryKW;
    private int consumpion;
    private String manufacturer;
    private String model;
    private int year;
    private int numberOfOwnersBefore;
    private int price;
    private int stock;
    private String type;
    private int hoursOfCharging;
    private String fastCharging;


    public Car(String manufacturer, String model, int year, int price, int motorKW, int batteryKW, int consumpion, int ownersBefore, int hoursOfCharging) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.motorKW = motorKW;
        this.batteryKW = batteryKW;
        this.consumpion = consumpion;
        this.numberOfOwnersBefore = ownersBefore;
        this.hoursOfCharging = hoursOfCharging;

    }

    public int getMotorKW() {
        return motorKW;
    }

    public void setMotorKW(int motorKW) {
        this.motorKW = motorKW;
    }

    public int getBatteryKW() {
        return batteryKW;
    }

    public void setBatteryKW(int batteryKW) {
        this.batteryKW = batteryKW;
    }

    public int getConsumpion() {
        return consumpion;
    }

    public void setConsumpion(int consumpion) {
        this.consumpion = consumpion;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getNumberOfOwnersBefore() {
        return numberOfOwnersBefore;
    }

    public void setNumberOfOwnersBefore(int numberOfOwnersBefore) {
        this.numberOfOwnersBefore = numberOfOwnersBefore;
    }

    public String getType() {
        if (numberOfOwnersBefore == 0) {
            this.type = "New";
        } else {
            this.type = "Used";
        }
        return type;
    }

    public int getHoursOfCharging() {
        return hoursOfCharging;
    }
}
