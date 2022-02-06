public class Klant {
    private final String naam;
    private double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;
    }

    public void setKorting(double korting) {
        this.kortingsPercentage = korting;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
