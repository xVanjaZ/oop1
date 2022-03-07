import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String type, double nieuwprijs, int bouwjaar, int framenummer) {
        super(type, nieuwprijs, bouwjaar);
        this.framenummer = framenummer;
    }

    @Override
    public double huidigeWaarde() {
        int verschil = LocalDate.now().getYear() - this.bouwjaar;
        return this.nieuwprijs * Math.pow(0.90, verschil);
    }

    @Override
    public boolean equals(Object object) {
        // Super gebruiken om te checken
        if (object instanceof Fiets) {
            Fiets compare = (Fiets) object;
            return super.equals(object) && this.framenummer == compare.framenummer;
        }
        return false;
    }
}