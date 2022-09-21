public class Auto {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String country;

    public Auto(String brand, String model, float engineVolume, String color, int productionYear, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Автомобиль" +
                "Марка " + brand +
                ", модель " + model +
                ", объем двигателя " + engineVolume +
                ", цвет кузова " + color +
                ", год производства " + productionYear +
                ", страна производства " + country;
    }
}
