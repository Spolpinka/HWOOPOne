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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear != 0) {
            this.productionYear = productionYear;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null) {
            this.country = country;
        }
    }
}
