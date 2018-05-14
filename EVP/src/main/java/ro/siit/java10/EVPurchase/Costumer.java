package ro.siit.java10.EVPurchase;

public class Costumer {
    private String name;
    private String surname;

    public Costumer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Costumer(String name) {
        this.name = name;
    }


}

