package ro.siit.java10.EVPurchase;

public class Client {
    private String name;
    private String surname;

    public Client() {

    }

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client(String name) {
        this.name = name;
    }


}

