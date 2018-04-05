package ro.siit.java10.EVPurchase;

import java.util.Objects;


public class Car {

    private int motorKW;
    private int batteryKW;
    private int consumpion;
    private String manufacturer;
    private String model;
    private int year;
    private int price;
    private int stock;
    private String type;
    private String fastCharging;
    private int rangePerChargeKM;
    private int horsePower;

    public Car(String manufacturer, String model, int year, int price, int horsePower, int motorKW, int batteryKW, int consumpion, String type, String fastCharging, int rangeKM, int stock) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.horsePower = horsePower;
        this.motorKW = motorKW;
        this.batteryKW = batteryKW;
        this.consumpion = consumpion;
        this.type = type;
        this.fastCharging = fastCharging;
        rangePerChargeKM = rangeKM;
        this.stock = stock;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getFastCharging() {
        return fastCharging;
    }

    public void setFastCharging(String fastCharging) {
        this.fastCharging = fastCharging;
    }

    public int getRangePerChargeKM() {
        return rangePerChargeKM;
    }

    public void setRangePerChargeKM(int rangePerChargeKM) {
        this.rangePerChargeKM = rangePerChargeKM;
    }

    public int getHorsePower() {
        return horsePower;
    }


    public String toString() {
        return String.format("Manufacturer: %s Model: %s\tYear: %d\tPrice: %d\tHP: %d\tMotor: %d\tBattery: %d\tConsumption: %d" +
                        "\tType: %s\tFastCharging: %s\tRange per charge: %d\tStock: %d\n", manufacturer, model, year, price, horsePower,
                motorKW, batteryKW, consumpion, type, fastCharging, rangePerChargeKM, stock);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return motorKW == car.motorKW &&
                batteryKW == car.batteryKW &&
                consumpion == car.consumpion &&
                year == car.year &&
                price == car.price &&
                stock == car.stock &&
                rangePerChargeKM == car.rangePerChargeKM &&
                horsePower == car.horsePower &&
                Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(model, car.model) &&
                Objects.equals(type, car.type) &&
                Objects.equals(fastCharging, car.fastCharging);
    }

    @Override
    public int hashCode() {

        return Objects.hash(motorKW,  batteryKW, consumpion, manufacturer, model, year, price, stock, type, fastCharging, rangePerChargeKM, horsePower);
    }
}

