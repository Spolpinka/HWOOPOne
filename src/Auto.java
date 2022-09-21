public class Auto {
    private String brand = "default";
    private String model = "default";
    private float engineVolume = 1.5f;
    private String color = "Белый";
    private int productionYear = 2000;
    private String country = "default";

    public Auto(String brand, String model, float engineVolume, String color, int productionYear, String country) {
        if (brand != null) {
            this.brand = brand;
        }
        if (model != null) {
            this.model = model;
        }
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        }
        if (color != null) {
            this.color = color;
        }
        if (productionYear != 0) {
            this.productionYear = productionYear;
        }
        if (country != null) {
            this.country = country;
        }
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
