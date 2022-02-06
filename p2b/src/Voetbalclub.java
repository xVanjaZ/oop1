public class Voetbalclub {
    private final String naam;
    private int aantalGewonnen, aantalGelijk, aantalVerloren;

    public Voetbalclub(String naam) {
        this.naam = naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            this.aantalGewonnen = this.aantalGewonnen + 1;
        if (ch == 'g')
            this.aantalGelijk = this.aantalGelijk + 1;
        if (ch == 'v')
            this.aantalVerloren = this.aantalVerloren + 1;
    }

    public int aantalPunten() {
        return (this.aantalGewonnen * 3) + this.aantalGelijk;
    }

    public int aantalGespeeld() {
        return this.aantalGewonnen + this.aantalGelijk + this.aantalVerloren;
    }

    @Override
    public String toString() {
        return this.naam + " " + this.aantalGespeeld() + " " + this.aantalGewonnen + " " + this.aantalGelijk + " " + this.aantalVerloren + " " + this.aantalPunten();
    }
}
