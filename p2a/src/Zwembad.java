public class Zwembad {
    private double breedte, lengte, diepte;

    public Zwembad() {
        this.breedte = 0;
        this.lengte = 0;
        this.diepte = 0;
    }

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public double inhoud() {
        return this.breedte * this.lengte * this.diepte;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + this.breedte + " meter breed, " + this.lengte + " meter lang, en " + this.diepte + " meter diep";
    }
}
