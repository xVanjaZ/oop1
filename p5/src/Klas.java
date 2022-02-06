import java.util.ArrayList;
import java.util.List;

public class Klas {
    private final String klasCode;
    private final List<Leerling> leerlingen = new ArrayList<>();

    public Klas(String klasCode) {
        this.klasCode = klasCode;
    }

    public void voegLeerlingToe(Leerling leerling) {
        this.leerlingen.add(leerling);
    }

    public void wijzigCijfer(String naam, double cijfer) {
        for (Leerling leerling : leerlingen) {
            if (leerling.getNaam().equals(naam)) {
                leerling.setCijfer(cijfer);
            }
        }
    }

    public List<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    @Override
    public String toString() {
        String s = "In klas " + klasCode + " zitten de volgende leerlingen:";
        for (Leerling l : leerlingen){
            s += "\n" + l;}
        return s + "\n";
    }
}
