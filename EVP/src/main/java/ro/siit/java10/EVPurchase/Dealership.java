package ro.siit.java10.EVPurchase;

import java.util.*;

public class Dealership {
    private String name;
    private Car car;
    private List<Car> listOfCars = new ArrayList<Car>();


    public Dealership(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCar(Car a) {
        listOfCars.add(a);
        System.out.println("Car added.");
    }

    public void filterCars() {

        Iterator<Car> iterator = listOfCars.iterator();
        while (iterator.hasNext()) {
            car = iterator.next();
            System.out.println(listOfCars.indexOf(car));
            if (car.getStock() != 0) {
                if (car.getFastCharging().equals("Yes")) {
                    System.out.println(listOfCars.toString());
                } else {
                    System.out.println("Not fast charging");
                }
            } else {
                System.out.println("Not in stock");
            }

        }
    }

    public void printCars() {
        for (Car a : listOfCars) {
            System.out.println(a.toString());
        }
    }

    public void sortListByPrice() {
        listOfCars.sort(new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return ((Integer) o1.getPrice()).compareTo(o2.getPrice());
            }
        });
        System.out.println(listOfCars);
    }

    public void sortListByRangePerHour() {
        listOfCars.sort(new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return ((Integer) o1.getRangePerChargeKM()).compareTo(o2.getRangePerChargeKM());
            }
        });
        System.out.println(listOfCars);
    }

    public void sortListByHP() {
        listOfCars.sort(new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return ((Integer) o1.getHorsePower()).compareTo(o2.getHorsePower());
            }
        });
        System.out.println(listOfCars);
    }
}






