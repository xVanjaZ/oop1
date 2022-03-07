import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String type, double nieuwprijs, int bouwjaar, String kenteken) {
        super(type, nieuwprijs, bouwjaar);
        this.kenteken = kenteken;
    }

    @Override
    public double huidigeWaarde() {
        int verschil = LocalDate.now().getYear() - this.bouwjaar;
        return this.nieuwprijs * Math.pow(0.70, verschil);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Auto) {
            Auto compare = (Auto) object;
            return super.equals(object) && this.kenteken.equals(compare.kenteken);
        }

        return false;
    }
}