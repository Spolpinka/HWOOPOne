package transport;


import java.time.LocalDate;

public class Auto {
    //поля
    private String brand = "default";
    private String model = "default";
    private float engineVolume = 1.5f;
    private String color = "Белый";
    private int productionYear = 2000;
    private String country = "default";
    private TRANSMISSION transmission = TRANSMISSION.MANUAL;
    private String bodyType = "classic";
    private String regNumber = "x000xx00";
    private int placesNumb = 5;
    private boolean tires = false;//false - летняя, true - зимняя

    private Key key;

    private Insurance insurance;

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public class Key {
        private boolean remoteStart;
        private boolean withoutKeyStart;

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isWithoutKeyStart() {
            return withoutKeyStart;
        }

        public Key(boolean remoteStart, boolean withoutKeyStart) {
            this.remoteStart = remoteStart;
            this.withoutKeyStart = withoutKeyStart;
        }

        @Override
        public String toString() {
            String result = "Ключ: возможность удаленного запуска - ";
            if (remoteStart) {
                result += "есть";
            } else {
                result += "нет";
            }
            result += ", возможность бесключевого доступа - ";
            if (withoutKeyStart) {
                result += "есть, ";
            } else {
                result += "нет, ";
            }
            return result;
        }
    }

    public class Insurance {
        private LocalDate timeframe;
        private float cost;
        private String number;

        public Insurance(LocalDate timeframe, float cost, String number) {
            if (timeframe.isAfter(LocalDate.now())) {
                this.timeframe = timeframe;
            } else {
                System.out.println("Срок страховки истёк" +
                        timeframe.getDayOfMonth() + "-" + timeframe.getMonthValue() + "-" + timeframe.getYear() + "-" +
                        "нужно срочно ехать оформлять новую страховку!");
                if (cost > 0) {
                    this.cost = cost;
                }
                if (number != null && !number.isBlank() && number.length() == 9) {
                    this.number = number;
                } else {
                    assert number != null;
                    if (number.length() != 9) {
                        System.out.println("Номер страховки некорректный!");
                    }
                }
            }
        }

        public LocalDate getTimeframe() {
            return timeframe;
        }

        public float getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "Страховка: " +
                    "действительна до " + timeframe.getDayOfMonth() + "-" + timeframe.getMonth() + "-"
                    + timeframe.getYear() +
                    ", стоимость - " + cost +
                    ", номер - " + number;
        }
    }

    //геттеры
    public String getTiresType() {
        if (isTires()) {
            return "зимняя резина, ";
        } else {
            return "летняя резина, ";
        }
    }

    private boolean isTires() {
        return tires;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPlacesNumb() {
        return placesNumb;
    }

    //сеттеры
    public void setTransmission(TRANSMISSION transmission) {
        this.transmission = transmission;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber != null && regNumber.isEmpty() && regNumber.isBlank()) {
            this.regNumber = regNumber;
        }
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Auto(String brand, String model, float engineVolume, String color, int productionYear, String country,
                TRANSMISSION transmission, String bodyType, String regNumber, int placesNumb, boolean tires) {
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
        if (transmission != null) {
            this.transmission = transmission;
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        }
        if (regNumber != null && !regNumber.isBlank() && !regNumber.isEmpty()) {
            this.regNumber = regNumber;
        }
        if (placesNumb > 0) {
            this.placesNumb = placesNumb;
        }
        this.tires = tires;
        if (key != null) {
            this.key = key;
        }

    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "марка - " + brand +
                ", модель - " + model +
                ", объем двигателя - " + engineVolume +
                ", цвет - " + color +
                ", год производства - " + productionYear +
                ", страна производства - " + country +
                ", тип трансмиссии - " + transmission +
                ", тип кузова - " + bodyType +
                ", государственный регистрационный номер - " + regNumber +
                ", количество мест - " + placesNumb +
                ", тип шин - " + getTiresType() +
                getKey().toString() +
                getInsurance().toString();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty()) {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public boolean setSeasonTyres(int month) {
        if (month > 0 && month < 13) {
            switch (month) {
                case 10:
                case 11:
                case 12:
                case 1:
                case 2:
                case 3:
                case 4:
                    return true;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
            }
        }
        return true;
    }

    public boolean isRegNumCorrect() {
        boolean result;
        if (!isDigit(regNumber.substring(0, 1))) {
            result = true;
        } else {
            return false;
        }
        if (isDigit(regNumber.substring(1, 2))) {
            result = true;
        } else {
            return false;
        }
        if (isDigit(regNumber.substring(2, 3))) {
            result = true;
        } else {
            return false;
        }
        if (isDigit(regNumber.substring(3, 4))) {
            result = true;
        } else {
            return false;
        }
        if (!isDigit(regNumber.substring(4, 5))) {
            result = true;
        } else {
            return false;
        }
        if (!isDigit(regNumber.substring(5, 6))) {
            result = true;
        } else {
            return false;
        }
        if (isDigit(regNumber.substring(6, 7))) {
            result = true;
        } else {
            return false;
        }
        if (isDigit(regNumber.substring(7, 8))) {
            result = true;
        } else {
            return false;
        }
        return result;
    }

    private boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
