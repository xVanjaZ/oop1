public class Huis {
    private final String adres;
    private final int bouwjaar;

    private Persoon huisbaas;

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    @Override
    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\n" +
                "en heeft huisbaas " + huisbaas;
    }
}
