package main;

import ro.siit.java10.EVPurchase.Car;
import ro.siit.java10.EVPurchase.Dealership;

public class Demo {
    public static void main(String[] args) throws Exception {
        Dealership dealership = new Dealership("CarSrl");
        Car c1 = new Car("Volkswagen", "e-UP", 2018, 25000, 82, 20,
                40, 17, "New", "No", 320, 3);
        Car c2 = new Car("Volkswagen", "e-Golf", 2018, 38000, 80, 23,
                43, 19, "New", "Yes", 400, 5);
        Car c3 = new Car("Renault", "Zoe", 2018, 33000, 79, 21,
                42, 20, "New", "Yes", 400, 10);
        Car c4 = new Car("BMW", "i3", 2018, 40000, 80, 25,
                45, 21, "New", "No", 350, 3);
        Car c5 = new Car("Smart", "ForTwo", 2018, 22000, 77, 20,
                40, 20, "New", "Yes", 200, 2);
        Car c6 = new Car("Smart", "ForFour", 2018, 22700, 86, 19,
                35, 15, "New", "No", 260, 7);
        Car c7 = new Car("Smart", "ForTwo Cabrio", 2018, 23000, 81, 22,
                40, 19, "New", "Yes", 300, 3);
        Car c8 = new Car("Kia", "Soul", 2018, 34000, 75, 20,
                40, 17, "New", "Yes", 400, 10);
        Car c9 = new Car("Hyundai", "Ioniq", 2018, 40000, 83, 20,
                45, 19, "New", "No", 370, 0);
        dealership.addCar(c1);
        dealership.addCar(c2);
        dealership.addCar(c3);
        dealership.addCar(c4);
        dealership.addCar(c5);
        dealership.addCar(c6);
        dealership.addCar(c7);
        dealership.addCar(c8);
        dealership.addCar(c9);
        //FEV2 Customer can filter the list based on the following information: has fast-charging, is in stock.
        dealership.printCars();
        //FEV3 Customer can sort list based on the following: price, range per charge, horsepower.
        dealership.filterCars();
        dealership.sortListByPrice();
        dealership.sortListByRangePerHour();
        dealership.sortListByHP();


    }
}
