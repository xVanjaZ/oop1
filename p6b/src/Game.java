import java.time.LocalDate;

public class Game {
    private final String naam;
    private final int releaseJaar;
    private final double nieuwPrijs;

    public Game(String naam, int releaseJaar, double nieuwPrijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwPrijs = nieuwPrijs;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        double korting = 0.7;
        double prijs = nieuwPrijs;

        int verschilInJaren = LocalDate.now().getYear() - releaseJaar;
        if (verschilInJaren > 0) {
            for (int i = 1; i <= verschilInJaren; i++) {
                prijs = prijs * korting;
            }
        }

        return prijs;
    }

    public boolean equals(Object object) {
        if (object instanceof Game) {
            Game compare = (Game) object;
            return this.naam.equals(compare.naam) && this.releaseJaar == compare.releaseJaar;
        }
        return false;
    }

    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + String.format("%.2f", nieuwPrijs) + " nu voor: €" + String.format("%.2f", huidigeWaarde());
    }
}
