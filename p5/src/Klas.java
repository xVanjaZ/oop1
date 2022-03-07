import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Klas {
    private final String klasCode;
    private final List<Leerling> leerlingen = new ArrayList<>();

    public Klas(String klasCode) {
        this.klasCode = klasCode;
    }

    public void voegLeerlingToe(Leerling leerling) {
        if (leerling == null) {
            throw new NullPointerException("Leerling is null");
        }

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
        return Collections.unmodifiableList(leerlingen); // do this more often!
    }

    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("In klas " + klasCode + " zitten de volgende leerlingen:");
        for (Leerling l : leerlingen){
            s.append("\n").append(l);}
        return s + "\n";
    }
}
