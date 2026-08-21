abstract class Appliances {
    protected String brand;

    public Appliances(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }

    public void turnOn() {
        System.out.println("Power ON");
    }

    public void turnOff() {
        System.out.println("Power OFF");
    }

    public abstract void operate();
}

class WashingMachine extends Appliances {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Washing clothes...");
    }
}

class Refrigerator extends Appliances {
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Storing food and beverages...");
    }
}

class AirConditioner extends Appliances {
    public AirConditioner(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Cooling the room...");
    }
}

class Television extends Appliances {
    public Television(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Displaying television programmes...");
    }
}

