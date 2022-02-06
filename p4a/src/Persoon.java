public class Persoon {
    String naam;
    int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
