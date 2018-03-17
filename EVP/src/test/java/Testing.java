import org.junit.Test;
import ro.siit.java10.EVPurchase.Car;
import ro.siit.java10.EVPurchase.Dealership;

import java.util.ArrayList;
import java.util.List;


public class Testing {

    @Test
    public void testing() {
        //test for array (Add car to array)
        Car[] arrayCars = new Car[2];
        arrayCars[0] = new Car("Renault", "Zoe", 2018, 33000, 14,
                40, 17, 0, 6);
        arrayCars[1] = new Car("Renault", "Zoe", 2018, 33000, 14,
                40, 17, 0, 6);

        //test for list
        List<Car> listOfCars = new ArrayList<Car>();
        Dealership dealership = new Dealership("CarDealer SRL");
        Car c1 = new Car("Volkswagen", "e-UP", 2018, 33000, 14,
                40, 17, 0, 6);
        c1.setStock(3);
        Car c2 = new Car("Smart", "FourTwo", 2016, 22000, 14,
                40, 17, 2, 6);
        c2.setStock(0);
        Car c3 = new Car("Kia", "Soul", 2018, 34000, 15,
                40, 17, 0, 8);
        c3.setStock(3);
        listOfCars.add(c1);
        listOfCars.add(c2);
        listOfCars.add(c3);

        //print ev cars, number of stock, and their prices from car dealerships
        //printing test
        for (Car car : listOfCars) {
            System.out.println("Dealer: " + dealership.getName());
            System.out.println("Manufacturer: " + car.getManufacturer() + "\n" + "Model: " + car.getModel() + "\n" +
                    "Stock: " + car.getStock() + "\n" + "Price: " + car.getPrice() + "\n");
        }

        //FILTER TEST
        for (Car b : listOfCars) {
            if (b.getStock() != 0) {
                if (b.getHoursOfCharging() < 7) {
                    System.out.println("Manufacturer: " + b.getManufacturer() + "\n" + "Model: " + b.getModel() + "\n" +
                            "Stock: " + b.getStock() + "\n" + "Price: " + b.getPrice() + "\n"
                            + "Charging: " + b.getHoursOfCharging() + "\n" + "Type: " + b.getType() + "\n");
                } else {
                    System.out.println("It's not fast charging");
                }
            } else {
                System.out.println("Car is not in stock. ");
            }
        }

    }
}
