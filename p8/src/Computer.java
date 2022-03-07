import java.text.DecimalFormat;
import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }

    @Override
    public double huidigeWaarde() {
        int verschil = LocalDate.now().getYear() - this.productieJaar;
        return this.aanschafPrijs * Math.pow(0.60, verschil);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Computer) {
            Computer compare = (Computer) object;
            return super.equals(object) && this.macAdres.equals(compare.macAdres);
        }

        return false;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.##");
        return "Computer: " + this.type + " met macAdres " + this.macAdres + " heeft een waarde van: " + df.format(this.huidigeWaarde());
    }
}
