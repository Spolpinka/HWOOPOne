public class Auto {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String country;
    String def = "default";
    float defVolume = 1.5f;
    String defColor = "Белый";
    int defProductionYear = 2000;

    public Auto(String brand, String model, float engineVolume, String color, int productionYear, String country) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = def;
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = def;
        }
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = defVolume;
        }
        if (color != null) {
            this.color = color;
        } else {
            this.color = defColor;
        }
        if (productionYear != 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = defProductionYear;
        }
        if (country != null) {
            this.country = country;
        } else {
            this.country = def;
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
