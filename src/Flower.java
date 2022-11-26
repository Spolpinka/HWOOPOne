public class Flower {
    public String getType() {
        return type;
    }

    private String type = "Ромашка";
    private String flowerColor = "Белый";
    private String country = "Россия";
    private float cost = 1.00f;
    int lifeSpan = 3;


    public Flower(String type, String flowerColor, String country, float cost, int lifeSpan) {
        this.type = type;
        if (flowerColor != null || !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        }
        if (country != null || !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        }
        if (cost > 0) {
            this.cost = cost;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        }
    }

    public Flower (String type, float cost, int lifeSpan) {
        this.type = type;
        if (country != null || !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        }
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public Flower(String type, String country, float cost) {
        this.type = type;
        this.country = country;
        this.cost = cost;
    }

    public Flower(String type, String country, float cost, int lifeSpan) {
        this.type = type;
        if (country != null || !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        }
        if (cost > 0) {
            this.cost = cost;
        }
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }



    public String getCountry() {
        return country;
    }



    public float getCost() {
        return cost;
    }



    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return "Цветок " +
                "цвет - " + flowerColor +
                ", страна происхождения - " + country +
                ", стоимость - " + cost +
                ", срок стояния - " + lifeSpan;
    }
}
