package ro.siit.java10.EVPurchase;
import java.util.*;

public class Dealership {
    private String name;
    private Car car;
    private final List<Car> listOfCars = new ArrayList<Car>();
    private final ArrayList<Costumer> costumerList = new ArrayList<Costumer>();


    public Dealership(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void registerCostumer(Costumer c) {
        costumerList.add(c);
    }

    public void addCar(Car a) {
        listOfCars.add(a);
        System.out.println("Car added.");
    }

    public List<Car> filterCars() {
        List<Car> filterList = new ArrayList<>(listOfCars);
        Iterator<Car> iterator = filterList.iterator();
        while (iterator.hasNext()) {
            car = iterator.next();
            System.out.println(filterList.indexOf(car));
            if (car.getStock() != 0) {
                if (car.getFastCharging().equals("Yes")) {
                    System.out.println(filterList.toString());
                } else {
                    System.out.println("Not fast charging");
                }
            } else {
                System.out.println("Not in stock");
            }

        }
        return filterList;
    }

    public List<Car> printCars() {
        List<Car> printingCars = new ArrayList<Car>(listOfCars);
        return printingCars;

    }

    public List<Car> getSortedListByPrice() {
        List<Car> listPrice = new ArrayList<Car>(Collections.unmodifiableList(listOfCars));
        listPrice.sort(Car.COMPARE_BY_PRICE);
        return listPrice;
    }

    public List<Car> sortListByRangePerHour() {
        List<Car> listRPH = new ArrayList<Car>(Collections.unmodifiableList(listOfCars));
        listRPH.sort(Car.COMPARE_BY_RANGE_PER_HOUR);
        return listRPH;
    }

    public List<Car> sortListByHP() {
        List<Car> listHP = new ArrayList<Car>(Collections.unmodifiableList(listOfCars));
        listHP.sort(Car.COMPARE_BY_HORSE_POWER);
        return listHP;
    }
}






