package tema.siit.cars;

import Cars.Car;
import dealer.Dealer;

import java.util.Arrays;
import java.util.List;

public class AddData {
    public static void main(String[] args) {
        //for dealer 1 (WeltAuto)
        Dealer dealer1 = new Dealer("CarDealer Inc.");
        Car vw1 = new Car(30, 50, 15, "Volkswagen", "e-UP", 2018, 25000, 5, 0);
        dealer1.addCar(vw1);
        //dealer1.addManufacturer(vw1);
        Car vw1Used = new Car(30, 50, 17, "Volkswagen", "e-UP", 2015, 25000, 1, 1);
        dealer1.addCar(vw1Used);
        Car vw2 = new Car(25, 45, 19, "Volkswagen", "e-Golf", 2017, 38000, 5, 0);
        dealer1.addCar(vw2);
        Car vw2Used = new Car(25, 45, 19, "Volkswagen", "e-Golf", 2017, 38000, 5, 0);
        dealer1.addCar(vw2Used);
        Car ren = new Car(23, 43, 17, "Renault", "Zoe", 2018, 33000, 5, 0);
        dealer1.addCar(ren);
        //dealer1.addManufacturer(ren);
        Car hy = new Car(33, 40,14, "Hyundai", "Ioniq", 2018, 33000, 3, 0);
        dealer1.addCar(hy);
        //dealer1.addManufacturer(hy);
        Car hyUsed = new Car(33, 40,14, "Hyundai", "Ioniq", 2018, 33000, 3, 1);
        dealer1.addCar(hyUsed);



        //for dealer 2 (BMW World)
        Dealer dealer2 = new Dealer("BMW World");
        Car BMW = new Car(30, 55, 13, "BMW", "i3", 2018, 40000, 5, 0);
        dealer2.addCar(BMW);
        //dealer2.addManufacturer(BMW);
        Car BMWUsed = new Car(30, 55, 13, "BMW", "i3", 2018, 40000, 1, 1);
        dealer2.addCar(BMWUsed);

        dealer1.printListOfNewCars(dealer1);
        dealer1.printListOfUsedCars(dealer1);




        //Unit Testing  - e automatizat;
        //Before  - test driven dev
        //

    }

}
