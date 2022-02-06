import java.text.DecimalFormat;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar) {
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Voertuig) {
            Voertuig compare = (Voertuig) object;
            return this.type.equals(compare.type) && this.bouwjaar == compare.bouwjaar && this.nieuwprijs == compare.nieuwprijs;
        }

        return false;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.##");
        return "Voertuig: " + this.type + " met bouwjaar " + this.bouwjaar + " heeft een waarde van: " + df.format(this.huidigeWaarde());
    }
}