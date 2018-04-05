import org.testng.annotations.Test;
import ro.siit.java10.EVPurchase.Car;
import ro.siit.java10.EVPurchase.Dealership;


import static org.hamcrest.CoreMatchers.*;

import java.util.*;

import static org.junit.Assert.*;

public class Testing {
    @Test
    public void addingToArray() {
        //test for array (Add car to array)
        Car[] arrayCars = new Car[2];
        Car c2 = new Car("Volkswagen", "e-Golf", 2018, 38000, 80, 23,
                43, 19, "New", "Yes", 400, 5);
        Car c3 = new Car("Renault", "Zoe", 2018, 33000, 79, 21,
                42, 20, "New", "Yes", 400, 10);

        arrayCars[0] = c2;
        arrayCars[1] = c3;
        Car[] expected = {c2, c3};
        assertArrayEquals(expected, arrayCars);

    }

    @Test
    public void addingToList() {
        //test for list
        List<Car> listOfCars = new ArrayList<Car>();
        Dealership dealership = new Dealership("CarDealer SRL");
        Car c1 = new Car("Volkswagen", "e-Golf", 2018, 38000, 80, 23,
                43, 19, "New", "Yes", 400, 5);
        Car c2 = new Car("Renault", "Zoe", 2018, 33000, 79, 21,
                42, 20, "New", "Yes", 400, 10);
        Car c3 = new Car("BMW", "i3", 2018, 40000, 80, 25,
                45, 21, "New", "No", 350, 3);
        listOfCars.add(c1);
        listOfCars.add(c2);
        listOfCars.add(c3);
        assertThat(listOfCars.get(0).getManufacturer(), is("Volkswagen"));
        assertThat(listOfCars.get(1).getManufacturer(), is("Renault"));
        assertThat(listOfCars.get(2).getManufacturer(), is("BMW"));

    }

    @Test
    public void printingCars() {
        //print ev cars, number of stock, and their prices from car dealership;
        List<Car> listOfCars = new ArrayList<Car>();
        Car c4 = new Car("BMW", "i3", 2018, 40000, 80, 25,
                45, 21, "New", "No", 350, 3);
        Car c5 = new Car("Smart", "ForTwo", 2018, 22000, 77, 20,
                40, 20, "New", "Yes", 200, 2);
        listOfCars.add(c4);
        listOfCars.add(c5);
        for (Car car : listOfCars) {
            System.out.println("Car nr: " + listOfCars.indexOf(car));
            System.out.println(car.toString());
        }


    }

    @Test
    public void filterList() {
        //FILTER TEST
        List<Car> listOfCars = new ArrayList<Car>();
        Car printCar;
        Car c6 = new Car("Smart", "ForFour", 2018, 22700, 86, 19,
                35, 15, "New", "Yes", 260, 0);
        Car c7 = new Car("Smart", "ForTwo Cabrio", 2018, 23000, 81, 22,
                40, 19, "New", "Yes", 300, 3);
        Car c8 = new Car("Kia", "Soul", 2018, 34000, 75, 20,
                40, 17, "New", "No", 400, 10);
        Car c9 = new Car("Hyundai", "Ioniq", 2018, 40000, 83, 20,
                45, 19, "New", "Yes", 370, 2);
        listOfCars.add(c6);
        listOfCars.add(c7);
        listOfCars.add(c8);
        listOfCars.add(c9);

        Iterator<Car> iterator = listOfCars.iterator();
        while (iterator.hasNext()) {
            printCar = iterator.next();
            System.out.println(listOfCars.indexOf(printCar));
            if (printCar.getStock() != 0) {
                if (printCar.getFastCharging().equals("Yes")) {
                    System.out.println(listOfCars.toString());
                } else {
                    System.out.println("Not fast charging");
                }
            } else {
                System.out.println("Not in stock");
            }

        }


    }

    @Test
    public void sortingTestByPrice() {
        List<Car> carList = new ArrayList<Car>();
        Car c10 = new Car("Kia", "Soul", 2018, 34000, 75, 20,
                40, 17, "New", "Yes", 400, 10);
        Car c11 = new Car("Hyundai", "Ioniq", 2018, 40000, 83, 20,
                45, 19, "New", "Yes", 370, 2);
        Car c12 = new Car("Volkswagen", "e-Golf", 2018, 38000, 80, 23,
                43, 19, "New", "Yes", 400, 5);
        Car c13 = new Car("Renault", "Zoe", 2018, 33000, 79, 21,
                42, 20, "New", "Yes", 400, 10);
        carList.add(c10);
        carList.add(c11);
        carList.add(c12);
        carList.add(c13);

        carList.sort(new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return ((Integer) o1.getPrice()).compareTo(o2.getPrice());
            }
        });

        assertThat(carList.get(0).getManufacturer(), is("Renault"));
        assertThat(carList.get(1).getManufacturer(), is("Hyundai"));
        assertThat(carList.get(2).getManufacturer(), is("Volkswagen"));
        assertThat(carList.get(3).getManufacturer(), is("Kia"));
        System.out.println(carList);

    }

    @Test
    public void sortingTestByRange() {
        List<Car> carList = new ArrayList<Car>();
        Car c14 = new Car("Kia", "Soul", 2018, 34000, 75, 20,
                40, 17, "New", "Yes", 400, 10);
        Car c15 = new Car("Hyundai", "Ioniq", 2018, 40000, 83, 20,
                45, 19, "New", "Yes", 370, 2);
        Car c16 = new Car("Volkswagen", "e-Golf", 2018, 38000, 80, 23,
                43, 19, "New", "Yes", 400, 5);
        Car c17 = new Car("Renault", "Zoe", 2018, 33000, 79, 21,
                42, 20, "New", "Yes", 400, 10);
        carList.add(c14);
        carList.add(c15);
        carList.add(c16);
        carList.add(c17);

        carList.sort(new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return ((Integer) o1.getRangePerChargeKM()).compareTo(o2.getRangePerChargeKM());

            }
        });
        assertThat(carList.get(0).getManufacturer(), is("Hyundai"));
        assertThat(carList.get(1).getManufacturer(), is("Kia"));
        assertThat(carList.get(2).getManufacturer(), is("Volkswagen"));
        assertThat(carList.get(3).getManufacturer(), is("Renault"));
        System.out.println(carList);
    }

    @Test
    public void sortingTestByHP() {
        List<Car> cars = new ArrayList<Car>();
        Car c18 = new Car("Smart", "ForTwo Cabrio", 2018, 23000, 81, 22,
                40, 19, "New", "Yes", 300, 3);
        Car c19 = new Car("Kia", "Soul", 2018, 34000, 75, 20,
                40, 17, "New", "Yes", 400, 10);
        Car c20 = new Car("Hyundai", "Ioniq", 2018, 40000, 83, 20,
                45, 19, "New", "Yes", 370, 2);
        cars.add(c18);
        cars.add(c19);
        cars.add(c20);
        cars.sort(new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return ((Integer) o1.getHorsePower()).compareTo(o2.getHorsePower());
            }
        });
        System.out.println(cars);
        assertThat(cars.get(0).getManufacturer(), is("Kia"));
        assertThat(cars.get(1).getManufacturer(), is("Smart"));
        assertThat(cars.get(2).getManufacturer(), is("Hyundai"));
    }


}












