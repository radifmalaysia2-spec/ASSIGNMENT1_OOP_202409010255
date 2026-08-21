public class Main {
    public static void main(String[] args) {
        Appliances[] appliances = {
            new WashingMachine("LG"),
            new Refrigerator("Panasonic"),
            new AirConditioner("Daikin"),
            new Television("Samsung")
        };

        for (Appliances appliance : appliances) {
            appliance.displayBrand();
            appliance.turnOn();
            appliance.operate();
            appliance.turnOff();
            System.out.println();
        }
    }
}

