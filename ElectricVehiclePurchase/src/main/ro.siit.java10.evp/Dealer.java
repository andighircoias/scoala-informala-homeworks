package dealer;

import Cars.Car;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Dealer {
    private String name;
    private String[] manufac = new String[6];
    private Car[] newCars = new Car[5];
    private Car[] usedCars = new Car[2];
    private int i = 0;
    private int j = 0;
    int x = 0;
    int owners = 0;
    List<Car> listOfNewCars = Arrays.asList(newCars);
    List<Car> listOfUsedCars = Arrays.asList(newCars);
    public void printListOfNewCars(Dealer d){
        System.out.println("Cars from dealer "+d.getName()+ "are: \n");
        System.out.println("New cars: ");
        for(Car a : listOfNewCars){
            System.out.println("Manufacturer: " +a.getManufacturer());
            System.out.println("Model: " +a.getModel());
            System.out.println("Price: "+a.getPrice());
            System.out.println("Stock: " +a.getStock()+ "\n");

        }
    }
    public void printListOfUsedCars(Dealer d) {
        System.out.println("Used cars :");
        for (Car a : listOfUsedCars) {
            System.out.println("Manufacturer: " +a.getManufacturer());
            System.out.println("Model: " +a.getModel());
            System.out.println("Price: "+a.getPrice());
            System.out.println("Stock: " +a.getStock()+"\n");
        }
    }
    public String getName() {
        return name;
    }

    public Dealer(String name) {
        this.name = name;
    }

    public void addCar(Car a) {

        if (i < newCars.length && a.getNumberOfOwners() == owners) {
            newCars[i] = a;
            i++;
        }
        if (j < usedCars.length && a.getNumberOfOwners() > owners) {
            usedCars[j] = a;
            j++;

        }
    }

    public void addManufacturer(Car a) {
        if (x < manufac.length) {
            manufac[x] = a.getManufacturer();
            System.out.println("Manufacturer " + manufac[x] + " stored into array.\n");
            x++;
        }

    }

//    public void retrieveCars(Dealer d) {
//        System.out.println("New caes from dealer: " + d.getName() + " are:");
//        for (Car a: newCars) {
//            System.out.println(a.getManufacturer());
//            System.out.println(a.getModel());
//            System.out.println(a.getPrice());
//            System.out.println(a.getStock());
//
//        }
//    }


}


























