import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bouquet {
    private Flower[] bouquet;

    public Flower[] getBouquet() {
        return bouquet;
    }

    public Bouquet(Flower[] bouquet) {
        if (bouquet != null) {
            this.bouquet = bouquet;
        }
    }

    public void addFlower(Flower f) {
        bouquet = Arrays.copyOf(getBouquet(), getBouquet().length + 1);
        bouquet[bouquet.length - 1] = f;
    }

    public float getBouquetCost() {
        float cost = 0.00f;
        for (Flower f : bouquet) {
            cost += f.getCost();
        }
        return (cost * 1.10f);
    }

    public int getBouquetSpan() {
        int minSpan = bouquet[0].lifeSpan;
        for (Flower f : bouquet) {
            if (f.lifeSpan < minSpan) {
                minSpan = f.lifeSpan;
            }
        }
        return minSpan;
    }

    public String getBouquetComposition(){
        String composition = "";
        List<Flower> uniqueFlowers = new ArrayList<>();
        for (Flower f : bouquet) {
            if (!uniqueFlowers.contains(f)) {
                uniqueFlowers.add(f);
            }
        }

        for (int i = 0; i < uniqueFlowers.size(); i++) {
            int count = 0;
            for (Flower f :
                    bouquet) {
                if (f.equals(uniqueFlowers.get(i))) {
                    count++;
                }
            }

            composition += uniqueFlowers.get(i).getType() + " - " + count + " штук, ";
        }
        return composition;
    }
}
