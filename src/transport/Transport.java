package transport;

import javax.swing.*;

public class Transport {
    private String brand = "default";
    private String model = "default";
    private int productionYear = 2000;
    private String country = "default";
    private String color = "Белый";
    private int maxSpeed;

    //constructor

    public Transport(String brand, String model, int productionYear, String country, String color) {
        new Transport(brand, model, productionYear, country);
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
    }

    public Transport(String brand, String model, int productionYear, String country, int maxSpeed) {
        new Transport(brand, model, productionYear, country);
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport(String brand, String model, int productionYear, String country) {
        if (brand != null && !brand.isBlank() && !brand.isEmpty()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
        if (productionYear > 0) {
            this.productionYear = productionYear;
        }
        if (country != null && !country.isBlank() && !country.isEmpty()) {
            this.country = country;
        }
    }

    //getters

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //setters


    public void setColor(String color) {

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "Марка - " + brand +
                ", модель - " + model +
                ", год производства - " + productionYear +
                ", страна производства - " + country +
                ", цвет - " + color +
                ", максимальная скорость - " + maxSpeed;
    }
}
