package transport;

import org.w3c.dom.ls.LSOutput;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String country, String color) {
        super(brand, model, productionYear, country, color);
    }

    @Override
    public void refill() {
        fuelPersent = 100;
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заправлен бензином");
    }
}
