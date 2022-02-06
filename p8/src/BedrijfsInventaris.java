import java.text.DecimalFormat;
import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String bedrijfsnaam, double budget) {
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
        this.alleGoederen = new ArrayList<Goed>();
    }

    public void schafAan(Goed niewgoed) {
        double kost = niewgoed.huidigeWaarde();

        if (kost > this.budget) {
            System.out.println("Kan goed niet aanschaffen: Geen budget meer over. Goed: " + niewgoed);
            return;
        }

        for (Goed goed : this.alleGoederen) {
            if (goed.equals(niewgoed)) {
                System.out.println("Kan goed niet aanschaffen: Goed bestaat al. Goed: " + niewgoed);
                return;
            }
        }

        this.budget -= kost;
        this.alleGoederen.add(niewgoed);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.##");
        return "BedrijfsInventaris: " + this.bedrijfsnaam + " heeft een budget over van " + df.format(this.budget) + ". Goederen: " + this.alleGoederen.toString();
    }
}
