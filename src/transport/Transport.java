package transport;

public class Transport {
    private String brand = "default";
    private String model = "default";
    private int productionYear = 2000;
    private String country = "default";
    private String color = "Белый";
    private int maxSpeed;

    //constructor

    public Transport(String brand, String model, int productionYear, String country, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.country = country;
        this.color = color;
        //this.maxSpeed = maxSpeed;
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
}
