public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        if (getGehuurdeAuto() == null) {
            return 0;
        } else {
            if (getHuurder() == null) {
                return 0;
            } else {
                return (100 - huurder.getKorting()) / 100 * getAantalDagen() * gehuurdeAuto.getPrijsPerDag();
            }
        }
    }


    public String toString() {
        if (getGehuurdeAuto() == null) {
            String s = "  er is geen auto bekend";
            if (getHuurder() == null) {
                return s + "\n  er is geen huurder bekend\n  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            } else {
                return s + "\n  op naam van: " + huurder.toString() + "\n  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            }
        } else {
            String s = "  autotype: " + gehuurdeAuto.toString();
            if (getHuurder() == null) {
                return s + "\n  er is geen huurder bekend\n  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            } else {
                return s + "\n  op naam van: " + huurder.toString() + "\n  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            }
        }
    }
}
