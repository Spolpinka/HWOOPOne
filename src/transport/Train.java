package transport;

import org.w3c.dom.ls.LSOutput;

public class Train extends Transport {
    private float cost;
    private int timeOfRade; //в минутах
    private String nameArriveStation;
    private String nameDepartureStation;
    private int numbOfWagons;

    public Train (String brand, String model, int productionYear, String country, int maxSpeed,
                 float cost, int timeOfRade, String nameArriveStation, String nameDepartureStation,
                 int numbOfWagons) {
        super(brand, model, productionYear, country, maxSpeed);
        if (cost > 0) {
            this.cost = cost;
        }
        if (nameArriveStation != null && !nameArriveStation.isBlank() && !nameArriveStation.isEmpty()) {
            this.nameArriveStation = nameArriveStation;
        }
        if (nameDepartureStation != null && !nameDepartureStation.isEmpty() && !nameDepartureStation.isBlank()) {
            this.nameDepartureStation = nameDepartureStation;
        }
        if (numbOfWagons > 0) {
            this.numbOfWagons = numbOfWagons;
        }
        if (timeOfRade > 0) {
            this.timeOfRade = timeOfRade;
        }

    }

    public Train(String brand, String model, int productionYear, String country, int maxSpeed,
                 float cost, String nameArriveStation, String nameDepartureStation, int numbOfWagons) {
        super(brand, model, productionYear, country, maxSpeed);
        if (cost > 0) {
            this.cost = cost;
        }
        if (nameArriveStation != null && !nameArriveStation.isBlank() && !nameArriveStation.isEmpty()) {
            this.nameArriveStation = nameArriveStation;
        }
        if (nameDepartureStation != null && !nameDepartureStation.isEmpty() && !nameDepartureStation.isBlank()) {
            this.nameDepartureStation = nameDepartureStation;
        }
        if (numbOfWagons > 0) {
            this.numbOfWagons = numbOfWagons;
        }
    }

    //getters


    public float getCost() {
        return cost;
    }

    public int getTimeOfRade() {
        return timeOfRade;
    }

    public String getNameArriveStation() {
        return nameArriveStation;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public int getNumbOfWagons() {
        return numbOfWagons;
    }

    //setters

    public void setNumbOfWagons(int numbOfWagons) {
        if (numbOfWagons > 0) {
            this.numbOfWagons = numbOfWagons;
        }
    }

    @Override
    public void refill() {
        fuelPersent = 100;
        System.out.println("Поезд " + getBrand() + " " + getModel() + " заправлен дизелем");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", стоимость поездки - " + cost +
                ", время поездки - " + timeOfRade +
                ", станция отправления - " + nameArriveStation +
                ", конечная станция " + nameDepartureStation +
                ", количество вагонов - " + numbOfWagons;
    }
}
